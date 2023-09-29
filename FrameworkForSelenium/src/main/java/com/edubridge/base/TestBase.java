package com.edubridge.base;

import com.edubridge.util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import javax.naming.Name;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    //global variable
    public static WebDriver driver;
   public static Properties prop;
    public TestBase(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\NTS-Rutuja Tathe\\Documents\\FrameworkForSelenium\\src\\main\\java\\com\\edubridge\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void initialize(){
       String browserName=prop.getProperty("browser");
       if(browserName.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
       else if(browserName.equals("edge")){
           WebDriverManager.edgedriver().setup();
           driver=new EdgeDriver();
       }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_timeout,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.implicit_timeout, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }

    public void Capture_Screenshot(WebDriver driver,String Testname) throws IOException, InterruptedException {

        String timeStamp = new SimpleDateFormat("YYYY.mm.dd.hh.mm.ss").format(new Date());

        Thread.sleep(4000);

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        String destfilepath = System.getProperty("user.dir")+"\\screenshots\\"+Testname+timeStamp+".png";

        FileUtils.copyFile(src,new File(destfilepath));

    }

}
