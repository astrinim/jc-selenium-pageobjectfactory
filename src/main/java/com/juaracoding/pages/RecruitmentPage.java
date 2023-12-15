package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

    private WebDriver driver;



    public RecruitmentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

//    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
//    private WebElement btnRecruitment;
    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    public WebElement menuRecruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    public WebElement btnAddCandidate;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    private WebElement middleName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement vacancy;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
    private WebElement email;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
    private WebElement contactNumber;

    @FindBy(xpath = "//div[@class='oxd-file-div oxd-file-div--active']")
    private WebElement resume;

    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    private WebElement keywords;

    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    private WebElement dateOfApplication;

    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    private WebElement notes;

    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    private WebElement checklistConsent;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;


//    public void btnRecruitment() {
//        btnRecruitment.click();
//    }


    public String getMenuRecruitment(){
        return menuRecruitment.getText();

    }

    public void btnAdd(){
        btnAddCandidate.click();
    }
    public void addCandidate(String firstName, String middleName, String lastName, String vacancy, String email, String contactNumber, String resume,
                             String keywords, String dateOfApplication, String notes){
        this.firstName.sendKeys(firstName);
        this.middleName.sendKeys(middleName);
        this.lastName.sendKeys(lastName);
        this.vacancy.sendKeys(vacancy);
        this.email.sendKeys(email);
        this.contactNumber.sendKeys(contactNumber);
        this.resume.sendKeys(resume);
        this.keywords.sendKeys(keywords);
        this.dateOfApplication.sendKeys(dateOfApplication);
        this.notes.sendKeys(notes);
        checklistConsent.click();
        btnSave.click();

    }






    public void btnsave(){
        btnSave.click();
    }


}
