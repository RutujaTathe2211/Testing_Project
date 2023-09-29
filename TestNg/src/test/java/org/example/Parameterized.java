package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Parameterized {
    WebDriver driver;
    @BeforeClass
    //this parameter come from testng file
    @Parameters({"browser,url"})
    void setup(String browser,String app){
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get(app);


    }

    @Test(priority = 1)
    void logo(){
        WebElement logo=driver.findElement(By.xpath("/html/body/div[2]/div[1]/img"));
         Assert.assertFalse(logo.isDisplayed());
    }
    @Test(priority = 2)
    void title(){
        String Title= driver.getTitle();
        Assert.assertEquals("Swag Labs",Title,"Title not matched");
    }
    @AfterClass
     void tearDown(){
        driver.close();
}


}
