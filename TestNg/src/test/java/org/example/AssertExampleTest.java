package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AssertExampleTest {
    WebDriver driver;
    @BeforeClass
    void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://www.saucedemo.com/v1/");
    }
    @Test
    void login(){
        WebElement username= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]"));
        username.sendKeys("standard_user");
        WebElement PassWord=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[2]"));
        PassWord.sendKeys("secret_sauce");
        WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]"));
        login.click();
        org.testng.Assert.assertEquals("Swag Labs",driver.getTitle());
    }
    @AfterClass
    void tearDown(){
        driver.close();
    }
}
