package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClass_RightClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
        //before action class we needs to create driver class object
        Actions act=new Actions(driver);
        //ContextClickButton():used to right click
        act.contextClick(button).build().perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/ul/li[3]")).click();

        //driver switch to alert box get  text present in box//capture text on alert box
        System.out.println( driver.switchTo().alert().getText());

        //accept():accept the alert box by clickng ok button
        driver.switchTo().alert().accept();

        Thread.sleep(2000);
        driver.close();

    }
}
