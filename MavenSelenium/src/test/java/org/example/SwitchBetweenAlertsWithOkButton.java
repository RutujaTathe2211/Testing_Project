package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetweenAlertsWithOkButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Alerts.html");
        //alert with ok link
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
        //alert with ok button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();

        //switch to alert box
        System.out.println(driver.switchTo().alert().getText());//get text on alert box
        driver.switchTo().alert().accept(); //automatically click on ok button and cancel window
        //driver.switchTo().alert().dismiss();//automatically click on cancel button and close the popup

    }
}
