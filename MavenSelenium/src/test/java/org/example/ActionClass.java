package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        //mouseOver:without clicking any text
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
           //Developer-----Documentation
        //before creating action class driver object is necessary
        Actions act=new Actions(driver);

        Thread.sleep(4000);
        WebElement Developer=driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/nav/ul/li[2]/button/span"));
       WebElement Documentation= driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/nav/ul/li[2]/ul/li[4]/a"));
      // WebElement user=driver.findElement(By.linkText("Users"));

        //***********mouseOver****************
       //buil()+perform() is necessary after moveToElement.
      // act.moveToElement(Developer).build().perform();//move the cursor on admin tab
        //act.moveToElement(Documentation).click().build().perform();//move cursor on user management

        //we can write 2 stat in one also
          act.moveToElement(Developer).moveToElement(Documentation).click().build().perform();

          Thread.sleep(2000);
          WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]/div/div[2]/p"));
          Thread.sleep(2000);
          act.contextClick(button).build().perform();//right on that element

        driver.close();
    }
}
