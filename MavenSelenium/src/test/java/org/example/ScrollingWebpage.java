package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebpage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //1.scrolling using pixel
        Thread.sleep(2000);
        //js.executeScript("window.scrollBy(0,5000)","");

        //2.scrolling till we find that element
//        WebElement flag=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div/div[1]/h2"));
//        js.executeScript("arguments[0].scrollIntoView();",flag);

        //3.till bottom
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");




    }
}
