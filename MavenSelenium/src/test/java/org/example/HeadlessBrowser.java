package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {
    //steps to set the headless browser--used to run the process at backends.
    /*
    1.use chromeOptions class
    2.create object of chrome option and using that object we set headless browser to true
    3.initialize chromedriver
    4.take url

    **HtmlUnitDriver is by default headless, so we don't need to make it headless
     */
    public static void main(String[] args) {

        //********only for chromeBrowser**********
        WebDriverManager.chromedriver().setup();
        ChromeOptions option =new ChromeOptions();

        //option.setHeadless(true);
        option.addArguments("--headless");//second way to made browser as headless
        WebDriver driver=new ChromeDriver(option);

        driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());







    }
}
