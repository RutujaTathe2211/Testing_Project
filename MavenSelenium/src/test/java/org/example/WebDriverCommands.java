package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverCommands {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //delete all cookies
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        //driver.get("https://www.amazon.in/");//first amazon page
     // System.out.println("title of page:"+driver.getTitle());//return title of page
//        System.out.println("current url:"+driver.getCurrentUrl());//return url
        //System.out.println("page source:"+driver.getPageSource());//return page source


        //navigate command
//        driver.navigate().to("https://www.facebook.com/");//second goes to facebook page
//        System.out.println(driver.getTitle());
//
//        driver.navigate().back();//not take any argument because page is already in buffer//amazon
//        System.out.println(driver.getTitle());
//
//         driver.navigate().forward();//facebook
//        System.out.println(driver.getTitle());
//
//        driver.navigate().refresh();

        //conditional command
        driver.get("https://www.facebook.com/login/");
        WebElement email=driver.findElement(By.name("email"));
        WebElement password=driver.findElement(By.name("pass"));
          if(email.isDisplayed() && email.isEnabled())
        {
            email.sendKeys("Rutuja");
        }
        if (password.isDisplayed() && password.isEnabled()){

            password.sendKeys("54432");
        }
        WebElement signup=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[4]/a[2]"));
        signup.click();
//isSelected:whether the particular button is selected or not detected
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).isSelected());
 if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).isSelected()==false){
//select radio button
     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
     }
        driver.close();//close current window
       // driver.quit();//closes multiple windows at same time


    }
}
