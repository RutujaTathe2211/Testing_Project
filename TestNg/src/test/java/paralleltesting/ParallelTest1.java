package paralleltesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {
    WebDriver driver;
    @Test
    void logoTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://github.com/");
        WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div[4]/main/div[1]/div[2]/div/div/div[2]/h1"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(2000);
    }
    @Test
    void homePageTitle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://github.com/");
        Assert.assertEquals(driver.getTitle(),"GitHub: Let’s build from here · GitHub");
        Thread.sleep(2000);
    }
    @AfterTest
    void tearDown(){
        driver.close();
    }
}
