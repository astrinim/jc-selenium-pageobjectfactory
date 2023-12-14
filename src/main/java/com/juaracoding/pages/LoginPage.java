package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //Locator use page factory
    //tidak menggunakan titik koma, dibelakag ) pada xpath
    @FindBy(xpath = " //input[@placeholder='Username']") //atau inputan --> //input[@placeholder='Username']
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password'] ") //atau inputan --> //input[placeholder='Password']
    private WebElement password;

    @FindBy(xpath = " //button[@type='submit']") //atau inputan --> //button[contains(@class, 'login-button')]
    private WebElement btnLogin;

    @FindBy(xpath = " //h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']") //atau inputan --> //h6[contains(@class, 'topbar-header')]
    private WebElement txtDashboard;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    private WebElement btnProfile;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement btnLogout;

    @FindBy(xpath = "//p[contains(@class, 'alert-content-text')]")
    private WebElement txtInvalidLogin;

    //Step Action
//    public void login(String User){
//        username.sendKeys("Admin");
//        password.sendKeys("admin123");
//        btnLogin.click();
//    }
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void logout(){
        btnProfile.click();
        btnLogout.click();
    }


    public String getTxtDashboard(){
        return txtDashboard.getText();

    }

    public String getTxtInvalidLogin(){
        return txtInvalidLogin.getText();

    }

//    public String getTxtRequired(){
//        return txtRequired.getText();
//
//    }




}
