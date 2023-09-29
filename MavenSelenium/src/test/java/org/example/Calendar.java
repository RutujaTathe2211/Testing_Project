package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.id("datepicker")).click();
        //use Select class to handle dropdown in selenium
//        Select s=new Select(driver.findElement(By.xpath("/html/body/div[5]/div/a[2]")));
//        s.selectByVisibleText("2026");//to select the particular year

       // for clicking /selecting month we take for loop
       // future month date-------------
        for(int i=6;i>=1;i--) {
            driver.findElement(By.xpath("/html/body/div[5]/div/a[2]")).click();
            String m = driver.findElement(By.xpath("/html/body/div[5]/div/div/span[1]")).getText();
            if (m.equals("October")) {
                //as the date can be selected randomly during runtime we use linktext method
                driver.findElement(By.linkText("20")).click();
                break;
            } else {
                driver.findElement(By.xpath("/html/body/div[5]/div/a[2]")).click();

            }
            Thread.sleep(2000);

            //past month date--------
       }
       driver.close();

    }
}

