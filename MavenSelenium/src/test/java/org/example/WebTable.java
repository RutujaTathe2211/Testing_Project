package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/html_tables.asp");
        //count rows
        int row=driver.findElements(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr")).size();
        System.out.println("Total no of rows:"+row);

        //count column //tr==total no of rows,td=total no of column
        int column=driver.findElements(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr/th")).size();
        System.out.println("Total no of columns:"+column);
        Thread.sleep(2000);

        for(int i=2;i<=row;i++) {
            for (int j = 1; j <= column; j++) {
                Thread.sleep(2000);
                String data=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.print(data+"\t");
            }
            System.out.println();
        }

            driver.quit();
    }
}
