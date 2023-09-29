package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionExample {
    /*
    Assert type:
    Hard assertion:is an assertion which throw exception immediately ...that means next sentence not execute
    Soft assertion:Control is in our hand .after completion of test exception will throw
     */
    WebDriver driver;
    @BeforeClass
        void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://www.saucedemo.com/v1/");
    }

    @Test(priority = 1)
    void logo(){
        WebElement logo=driver.findElement(By.xpath("/html/body/div[2]/div[1]/img"));
        //testcase pass if this element found//if the assertion is not true then second msg will display
        //Assert.assertTrue(logo.isDisplayed(),"Logo not display on screen");
        //if we want check not to display logo
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
