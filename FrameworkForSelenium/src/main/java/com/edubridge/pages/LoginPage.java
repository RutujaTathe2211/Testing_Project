package com.edubridge.pages;

import com.edubridge.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    //page factory
   @FindBy(linkText = "Log In")
   WebElement loginButton;
    @FindBy(id = "login_email")
    WebElement email;

    @FindBy(id = "login_password")
    WebElement password;
    @FindBy(id="btnLoginSubmit")
    WebElement login;

    @FindBy(xpath = "//span[text()='Sign up']")
    WebElement signUp;

    @FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/a[1]/img")
    WebElement edubLogo;
    @FindBy(xpath = "//span[text()='Use email instead']")
    WebElement emailLink;

    public LoginPage(){
        //coming from base class//page factory initialize-initElements...this-current class object
        PageFactory.initElements(driver,this);
    }
    public HomePage login(String Email,String pass) throws InterruptedException {
        loginButton.click();
        emailLink.click();
        email.sendKeys(Email);
        password.sendKeys(pass);
        login.click();
        Thread.sleep(4000);
        return new HomePage();
    }
    //actions
    public String validatePageTitle(){
        loginButton.click();
        return driver.getTitle();
    }
    public boolean validateLogo(){
        //return true or false
        return edubLogo.isDisplayed();
    }

}
