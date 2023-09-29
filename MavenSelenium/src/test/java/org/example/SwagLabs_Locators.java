package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_Locators {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");

        //by:-class----give address to find element function
        //1.using name locator
        driver.findElement(By.name("user-name")).sendKeys("standard_user");

        //2.using id locator
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        //locate using link_text
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        Thread.sleep(2000);

        //3.using xpath
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/button")).click();
        //driver.findElement(By.cssSelector("button:contains("ADD TO CART")");

//        WebElement first= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
//        Thread.sleep(3000);
//        //first.click();
//        System.out.println(first.getText());

         /*2.Css selector
        1.tag and id:[ tag#idValue is used]
           driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

        2.tag and class:[ tag.ClassValue  is used]
        driver.findElement(By.cssSelector("input.form_input")).sendKeys("standard_user");

        3.tag and attribute:( Tag[attribute=value] is used)
        driver.findElement(By.cssSelector("input[name=user-name]")).sendKeys("standard_user");

       4.tag,class,attribute:( Tag.classvalue[attribute=value] is used)
         driver.findElement(By.cssSelector("input.form_input[name=user-name]")).sendKeys("standard_user");

       5.Inner Text:
       driver.findElement(By.cssSelector("tag:contains("text present outside tag")");

        */
        //relative x path----{ //tagname[@attribute='value'] }///for text -----{ //tagname[text()='outside tag text']}
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light' ]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='<- Back']")).click();


        driver.close();
    }
}
