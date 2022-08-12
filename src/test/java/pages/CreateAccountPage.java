package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ReadFromProperties;

import java.io.IOException;

public class CreateAccountPage {

    protected WebDriver webDriver;
    public String createAccountPageUrl = "https://www.google.com/intl/ro/gmail/about/";

    ReadFromProperties readProperties = new ReadFromProperties();

    @FindBy(xpath = "(//span[@class='laptop-desktop-only'])[1]")
    WebElement createAccountButton;
    @FindBy(id = "firstName")
    WebElement firstNameTextBox;
    @FindBy(id = "lastName")
    WebElement lastNameTextBox;
    @FindBy(id = "username")
    WebElement userNameTextBox;
    @FindBy(xpath = "//input[@name='Passwd']")
    WebElement passwordTextBox;
    @FindBy(xpath = "//input[@name='ConfirmPasswd']")
    WebElement confirmPasswordTextBox;
    @FindBy(id = "accountDetailsNext")
    WebElement nextButtonInformationAccount;
    @FindBy(id = "phoneNumberId")
    WebElement phoneNumberTextBox;
    @FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")
    WebElement buttonPhoneNumber;
    @FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")
    WebElement buttonConfirmPhone;
    @FindBy(xpath = "//input[@name='day']")
    WebElement birtdayTextBox;
    @FindBy(xpath = "//select[@id='month']")
    WebElement birthdayMonthTextBox;
    @FindBy(xpath = "//input[@name='year']")
    WebElement birthdayYearTextBox;
    @FindBy(css = "select[id='gender']")
    WebElement genderTextBox;

    @FindBy(xpath = "//span[@class='VfPpkd-vQzf8d']")
    WebElement buttonBirthdayGender;

    @FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[2]")
    WebElement buttonAcceptBenefits;
    @FindBy(xpath = "(//div[@class='t5nRo Id5V1'])[1]")
    WebElement checkBoxCustomizationInfo;
    @FindBy(xpath = "//span[@class='VfPpkd-vQzf8d']")
    WebElement buttonCustomizationInfo;
    @FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[2]")
    WebElement confirmButtonForSettings;
    @FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[1]")
    WebElement agreeButtonToCreateAccount;


    public CreateAccountPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        webDriver.get(createAccountPageUrl);
    }


    public void clickOnCreateAccountButton(){
        createAccountButton.click();
    }

    public void enterDateOnFirstPage() throws IOException {
        firstNameTextBox.sendKeys(readProperties.readFirstName());
        lastNameTextBox.sendKeys(readProperties.readLastName());
        userNameTextBox.sendKeys(readProperties.readUserName());
        passwordTextBox.sendKeys(readProperties.readPassword());
        confirmPasswordTextBox.sendKeys(readProperties.readPassword());
    }

    public void clickOnButtonInformationAccount(){
        nextButtonInformationAccount.click();
    }

    public void enterPhoneNumber() throws IOException {
        phoneNumberTextBox.sendKeys(readProperties.readPhoneNumber());
    }

    public void clickOnButtonPhoneNumber(){
        buttonPhoneNumber.click();
    }

    public void clickOnButtonConfirmNumber(){
        buttonConfirmPhone.click();
    }

    public void enterBirthdayDetailsAndGender() throws IOException {
        birtdayTextBox.sendKeys(readProperties.readBirthDay());

        Select monthList = new Select(birthdayMonthTextBox);
        monthList.selectByValue(readProperties.readMonth());

        birthdayYearTextBox.sendKeys(readProperties.readYear());

        Select genderList = new Select(genderTextBox);
        genderList.selectByValue(readProperties.readGender());
    }

    public void clickButtonBirthdayGender(){
        buttonBirthdayGender.click();
    }

    public void clickButtonAcceptBenefits(){
        buttonAcceptBenefits.click();
    }

    public void selectCheckBoxCustomization(){
        checkBoxCustomizationInfo.click();
    }

    public void clickButtonCustomization(){
        buttonCustomizationInfo.click();
    }

    public void clickConfirmButtonSettings(){
        confirmButtonForSettings.click();
    }

    public void clickAgreeButtonCreateAccount(){
        agreeButtonToCreateAccount.click();
    }




}
