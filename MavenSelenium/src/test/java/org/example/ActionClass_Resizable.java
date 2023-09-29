package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClass_Resizable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/resizable/");
        //resizable element
        driver.switchTo().frame(0);
        WebElement resizable=driver.findElement(By.xpath("//div[@id='resizable']"));
        Actions act=new Actions(driver);
        //                                                       length      height
        act.moveToElement(resizable).dragAndDropBy(resizable,100,150).build().perform();
        Thread.sleep(3000);


    }
}
