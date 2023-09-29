package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
    public static void main(String[] args) {
        //for setup web-driver as chromedriver
        WebDriverManager.chromedriver().setup();

        //invoke the browser
        WebDriver driver=new ChromeDriver();

        //for see browser window as maximize format
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
       // driver.findElement(By.name("username")).sendKeys("Rutuja");

        //enter username
        WebElement username=driver.findElement(By.name("email"));
        username.sendKeys("rutujatathe.2211@gmail.com");

        //enter password
        driver.findElement(By.name("pass")).sendKeys("rutuja@123");
        //click on sign in button
        driver.findElement(By.name("login")).click();

        String exptitle="Log in to Facebook";
        String actualTitle=driver.getTitle();//to get actual title
        System.out.println(actualTitle);//print title of webpage
        System.out.println(driver.getCurrentUrl());//print current url of webpage
        //validation point
        if(exptitle.equals(actualTitle)){
            System.out.println("Test is passed.");
        }else {
            System.out.println("Test is fail.");
        }
        driver.close();




    }

}
