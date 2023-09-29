package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SortedDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //used to provide implicit wait to browser
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement element =driver.findElement(By.id("country"));
        //Select class is used to handle dropdown
        Select s=new Select(element);
        List originalList=new ArrayList();
        List TempList=new ArrayList();


        //get all element of dropdown
        List<WebElement> options=s.getOptions();
        //to get all options
        for(WebElement e:options){
            //add options in both the list
            originalList.add(e.getText());
            TempList.add(e.getText());

        }
        //TempList=originalList;
        System.out.println("Before Sorting original list:"+originalList);
        System.out.println("Before Sorting templist."+TempList);

        //when we use sort function for templist it will also sort the original list//because of that we store element differently in list
        Collections.sort(TempList);
        System.out.println("After Sorting templist:"+ TempList);
        System.out.println("After Sorting Original List:"+ originalList);


        if(originalList==TempList){
            System.out.println("Dropdown is Sorted.");
        }else{
            System.out.println("Dropdown not Sorted.");
        }
        driver.close();
    }
}
