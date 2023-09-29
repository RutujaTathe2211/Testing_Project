package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClass_DragAndDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement source=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[4]"));
        WebElement target=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[7]"));
        Actions act=new Actions(driver);

        //for Drag and Drop:clickandhold,movetoelement,release
        act.clickAndHold(source).moveToElement(target).release().build().perform();

        WebElement s=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]"));
        WebElement t=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]"));
        //act.clickAndHold(s).moveToElement(t).release().build().perform();//another way
        act.dragAndDrop(s,t).build().perform();
    }
}
