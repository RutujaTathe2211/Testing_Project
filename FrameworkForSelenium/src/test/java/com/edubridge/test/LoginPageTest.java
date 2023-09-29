package com.edubridge.test;

import com.edubridge.base.TestBase;
import com.edubridge.pages.HomePage;
import com.edubridge.pages.LoginPage;
import com.edubridge.util.ListenerClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass.class)
public class LoginPageTest extends TestBase {
    LoginPage loginpage;
    HomePage homePage;
   public LoginPageTest(){
       //call super class constructor
       super();
    }

    @BeforeMethod
    public  void setup(){
        initialize();
        loginpage=new LoginPage();
    }
    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        homePage=loginpage.login(prop.getProperty("Email"),prop.getProperty("password") );
    }
    @Test(priority = 2)
    public void loginPageTitleTest(){
       String title=loginpage.validatePageTitle();
        Assert.assertEquals(title,"EduBridge Learning | Login");
    }
    @Test(priority = 3)
    public void EduLogoTest(){
       boolean flag=loginpage.validateLogo();
       Assert.assertTrue(flag);
    }
    @AfterMethod
    public void tearDown(){
       driver.quit();
    }
}
