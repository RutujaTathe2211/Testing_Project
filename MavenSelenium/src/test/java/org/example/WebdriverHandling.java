package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class WebdriverHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //for scroll webpage in browser
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,650)", "");

        /*for link------we use linktext
        driver.findElement(By.linkText("link")).isDisplayed();
        driver.findElement(By.linkText("link")).click();*/

        //name,city,country,mobno,email,also for bigText And textboxes
        driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Rutuja");
        driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Tathe");
        driver.findElement(By.name("RESULT_TextField-3")).sendKeys("7066905814");
        driver.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
        driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Pune");
        driver.findElement(By.name("RESULT_TextField-6")).sendKeys("rutujattahe@gmail.com");

        //radio button
        System.out.println(driver.findElement(By.cssSelector("label[for='RESULT_RadioButton-7_1']")).isSelected());
        driver.findElement(By.cssSelector("label[for='RESULT_RadioButton-7_1']")).click();

        //checkboxes
        driver.findElement(By.cssSelector("label[for='RESULT_CheckBox-8_1']")).click();
        driver.findElement(By.cssSelector("label[for='RESULT_CheckBox-8_2']")).click();

        //dropdown handling
        WebElement option=driver.findElement(By.id("RESULT_RadioButton-9"));
        Select s=new Select(option);
        //selectbyTextVisible--pass text//selectByIndex--pass values from 0//select by value---pass value
        s.selectByValue("Radio-0");
//        s.selectByIndex(2);//by index
//        s.selectByVisibleText("Monday");//by visible text
        System.out.println(s.getOptions().size());//get all options//no of items in dropdown box


        //file handling
//        //if input tag and for value are their then we send direct key/file path with their type//if not then we needs to use robot class
        driver.findElement(By.name("RESULT_FileUpload-10")).sendKeys("C:\\Users\\NTS-Rutuja Tathe\\Documents\\Github\\armstrongNumber.JAVA");



//
        //driver.close();
    }
}
