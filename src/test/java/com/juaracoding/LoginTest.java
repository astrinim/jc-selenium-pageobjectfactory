package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    private WebDriver driver;
    private int priority;
    //private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        //LoginPage loginPage = new LoginPage();
    }
        @AfterClass
        public void finish(){
            DriverSingleton.delay(3);
            DriverSingleton.closerObjectInstance();
        }

        @Test(priority = 1)
        public void testValidationLogin() {
            LoginPage loginPage = new LoginPage();
            loginPage.login("Admin", "admin123");
            Assert.assertEquals(loginPage.getTxtDashboard(), "Dashboard");

        }

        @Test(priority = 2)
        public void testInvalidLogin() {
            LoginPage loginPage = new LoginPage();
            loginPage.login("Adminn", "admin1234");
            Assert.assertTrue(loginPage.getTxtInvalidLogin().contains("Invalid"));

        }


    }
