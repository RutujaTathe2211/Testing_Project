package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowSwitch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
       // System.out.println(driver.getTitle());
        //getWindowHandles () is used for to get the id of available window
        //set s contain name of all available window
         Set<String> s= driver.getWindowHandles();
         //get the title of executed webpages
         for(String t:s){
            // System.out.println(t);//get id of page
             String id=driver.switchTo().window(t).getTitle();
             System.out.println(id);
             //used to close particular browser
             if(id.contains("Frames & windows")){
                 driver.close();
             }
         }

    }
}
