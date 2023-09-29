package com.edubridge.pages;

import com.edubridge.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class HomePage extends TestBase {
    //page factory
    @FindBy(id="bd-versions")
    WebElement usernameLabel;

    @FindBy(xpath = "/html/body/div[1]/aside/section/div/div[1]/ul/li[3]/a/span")
    WebElement CalendarLink;
    @FindBy(xpath = "/html/body/div[1]/aside/section/div/div[1]/ul/li[2]/a/span")
    WebElement myCoursesLink;
    @FindBy(xpath = "/html/body/div[1]/aside/section/div/div[1]/ul/li[2]/ul/li[1]/a")
    WebElement allCourses;

    public HomePage(){
        //coming from base class//page factory initialize-initElements...this-current class object
        PageFactory.initElements(driver,this);
    }
    public String verifyHomePageTitle() throws InterruptedException {
        Thread.sleep(4000);
       return driver.getTitle();
    }
    public CalendarPage clickOnCalendarLink()  {
        CalendarLink.click();
        return new CalendarPage();
    }
    public boolean verifyUsername(){

        return usernameLabel.isDisplayed();
    }
    public CoursesPage clickOnMyCoursesLink()  {

        myCoursesLink.click();
        allCourses.click();
        return new CoursesPage();
    }


}
