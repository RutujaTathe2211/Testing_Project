package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class AtionClass_Slider {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/slider/");
        driver.switchTo().frame(0);
       WebElement slider= driver.findElement(By.xpath("/html/body/div/span"));
        Actions act=new Actions(driver);
        act.moveToElement(slider).dragAndDropBy(slider,500,0).build().perform();

        }
}
