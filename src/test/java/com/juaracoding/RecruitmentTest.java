package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecruitmentTest {

    private WebDriver driver;
    private int priority;

    private RecruitmentPage recruitmentPage;
    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";
        driver.get(url);
        RecruitmentPage recruitmentPage = new RecruitmentPage();
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
        Assert.assertEquals(recruitmentPage.getMenuRecruitment(), "Recruitment");

    }


    @Test(priority = 2)
    public void testAddCandidate() {
        RecruitmentPage recruitmentPage = new RecruitmentPage();
        recruitmentPage.addCandidate("Astrin", "Indah", "Melliana", "QA Tester", "astrin@gmail.com",
                "0812312112", "abc.doc", "Testingg", "2023-12-14","Testing");
        //Assert.assertEquals(recruitmentPage.getMenuRecruitment(), "Recruitment");

    }





}
