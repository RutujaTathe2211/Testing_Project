package com.edubridge.test;

import com.edubridge.base.TestBase;
import com.edubridge.pages.CalendarPage;
import com.edubridge.pages.CoursesPage;
import com.edubridge.pages.HomePage;
import com.edubridge.pages.LoginPage;
import com.edubridge.util.ListenerClass;
import com.edubridge.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(ListenerClass.class)
public class HomePageTest extends TestBase {
    //test cases should be indepedent //their we be no linking
    //browser crash issue occur
    //execute test cases
    //after each test case close the browser

    LoginPage loginpage;
    HomePage homepage;
    CalendarPage calendarPage;
    CoursesPage coursePage;
    public HomePageTest(){
        //call super class constructor
        super();
    }
    @BeforeMethod
    public  void setup() throws InterruptedException {
        initialize();
        loginpage=new LoginPage();
        homepage= loginpage.login(prop.getProperty("Email"),prop.getProperty("password") );
    }
      @Test(priority = 1)
    public void verifyHomepageTitle() throws InterruptedException {

        String hometitle=homepage.verifyHomePageTitle();
        Assert.assertEquals(hometitle,"EB Learner Portal","Home page title not found");
    }
    @Test(priority = 2)
    public void verifyCorrectUsername(){

     Assert.assertTrue(homepage.verifyUsername());
   }
    @Test(priority = 3)
    public void VerifyCalendarPage() {
       // driver.switchTo().alert().dismiss();
        calendarPage=homepage.clickOnCalendarLink();
    }
    @Test(priority = 4)
    public void VerifyCoursePage()  {
        coursePage=homepage.clickOnMyCoursesLink();
    }

    @AfterMethod
    public  void teardown(){
        driver.quit();
    }

}
