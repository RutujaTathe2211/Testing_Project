package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");

        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("rutuja");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rutuja123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@href='reservation.php'][text()='Flights']")).click();
        Thread.sleep(1000);




        driver.close();
    }
}
