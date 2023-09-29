package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

        //Full page screenshot
       TakesScreenshot ts=(TakesScreenshot) driver;
       File src=ts.getScreenshotAs(OutputType.FILE);
       Thread.sleep(2000);
       File trg=new File(".//Screenshots//Amazon.png");
       FileUtils.copyFile(src,trg);

    }
}
