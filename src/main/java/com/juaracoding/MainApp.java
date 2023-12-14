package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainApp {
    private static WebDriver driver;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        DriverSingleton.getInstance("chrome"); //cara mengganti browser. bisa chrome, firefox dll
        driver = DriverSingleton.getDriver();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);

        //Call method from pages
        LoginPage loginPage = new LoginPage(); //panggil method harus buat instance dlu
        loginPage.login("Admin", "admin123");
        System.out.println(loginPage.getTxtDashboard());

        //Call method from pages
        RecruitmentPage recruitmentPage = new RecruitmentPage();
        recruitmentPage.addCandidate("Astrin", "Indah", "Melliana", "QA Tester", "astrin@gmail.com",
                "0812312112", "abc.doc", "Perkenalkan nama saya Astrin", "2023-12-14","Testing");
        System.out.println(recruitmentPage.getMenuRecruitment());


        loginPage.logout();
        loginPage.login("Adminn", "adin1234");
        System.out.println(loginPage.getTxtInvalidLogin());


//        loginPage.login("", "admin123");
//        System.out.println(loginPage.getTxtRequired());
        DriverSingleton.delay(3);
        DriverSingleton.closerObjectInstance();







    }
}