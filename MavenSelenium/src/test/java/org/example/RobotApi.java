package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class RobotApi {
    /*
    -used to automate the mouse and keyboard operation
     */
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://spreadsheetpage.com/calendar/");
        driver.findElement(By.xpath("/html/body/main/section/section/article/div/section[2]/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div[3]/p/a")).click();
        driver.findElement(By.xpath("/html/body/main/section/section/article/section[2]/div[1]/div[3]/div[2]/div/p/a[1]")).click();
        Robot robot=new Robot();
        /*down arrow
        3 times tab key
        enter
         */
        robot.keyPress(KeyEvent.VK_DOWN);//press down arrow in keyboard
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_TAB);//press tab in keyboard
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_TAB);//press tab in keyboard
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_TAB);//press tab in keyboard
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_ENTER);//press enter in keyboard


    }
}
