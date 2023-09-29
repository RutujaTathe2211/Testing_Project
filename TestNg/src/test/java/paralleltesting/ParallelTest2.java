package paralleltesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;
    @Test
    void loginTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //delete all cookies
        driver.manage().deleteAllCookies();
        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Assert.assertEquals("Swag Labs",driver.getTitle());

    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
