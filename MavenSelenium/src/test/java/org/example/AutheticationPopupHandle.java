package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutheticationPopupHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // http://username:password@url------syntax to avoid authentication popup
         driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
         String text=driver.findElement(By.cssSelector("p")).getText();
        System.out.println(text);

         driver.close();
    }
}
