package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class AlertWithOkAndCancelButton {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Alerts.html");
        //alert with cancel ok link
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();

        //alert with cancel ok button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
         String expOk="You pressed Ok";
         driver.switchTo().alert().accept();
        String actualtext=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p")).getText();
        //validate test cases
        if(expOk.equals(actualtext)==true){
            System.out.println("you selected ok button");
        }
          Thread.sleep(2000);
        //alert box for dismiss purpose
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
        String expCancel="You Pressed Cancel";
        driver.switchTo().alert().dismiss();
        String actualCancel=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p")).getText();

        if(expCancel.equals(actualCancel)==true){
            System.out.println("you selected cancel button");
        }

        Thread.sleep(2000);
        //path for alert ok cancel,text
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        //for alert ,ok,cancel button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("rutuja");
        driver.switchTo().alert().accept();
        String exptext="Hello rutuja How are you today";
        Thread.sleep(2000);
        String actual=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/p")).getText();
        if(exptext.equals(actual)){
            System.out.println("you have enter text correctly.");
        }
        TakesScreenshot ss = (TakesScreenshot) driver;
        File src =ss.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\NTS-Rutuja Tathe\\Documents\\MavenSelenium\\src\\test\\Screenshot\\abc.png");
        FileUtils.copyFile(src,des);

        driver.close();
    }
}
