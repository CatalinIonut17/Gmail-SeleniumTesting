package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ReadEmailContent;
import utils.ReadFromProperties;
import utils.ReadRecipientsContent;
import utils.ReadSubjectContent;

import java.io.IOException;

public class LoginPage {

    protected WebDriver webDriverlogin;
    public String loginPageUrl =
            "https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

    ReadFromProperties readFromProperties = new ReadFromProperties();


    @FindBy(id = "identifierId")
    WebElement emailTextBox;
    @FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")
    WebElement buttonNextEmail;
    @FindBy(css = "input[name='password']")
    WebElement passwordTextBox;
    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button")
    WebElement buttonLogin;
    @FindBy(xpath = "//img[@class='gb_yc']")
    WebElement logoGoogle;

    @FindBy(xpath = "//div[@class='T-I T-I-KE L3']")
    WebElement buttonWriteMessage;
    @FindBy(name = "to")
    WebElement recipientTextBox;
    @FindBy(name = "subjectbox")
    WebElement subjectTextBox;
    @FindBy(id = ":a0")
    WebElement messageBody;
    @FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
    WebElement sendButton;

    @FindBy(xpath = "//div[@id=':29']")
    WebElement lastMailReceived;
    @FindBy(xpath = "(//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA'])[2]")
    WebElement deletelastEmailReceived;

    @FindBy(xpath = "(//span[@class='J-Ke n4 ah9'])[1]")
    WebElement expandOptions;
    @FindBy(xpath = "//div[@class='TN bzz aHS-bnx']")
    WebElement trashCan;
    @FindBy(xpath = "(//div[@class='T-I J-J5-Ji T-Pm T-I-ax7 L3 J-JN-M-I'])[2]")
    WebElement checkBoxDeleteAllFromTrash;
    @FindBy(xpath = "//div[@class='Bn']")
    WebElement deleteAllFromTrash;

    @FindBy(xpath = "//span[@class='x2']")
    WebElement deleteButtonTrash;
    @FindBy(xpath = "//button[name='ok']")
    WebElement confirmDelete;

    @FindBy(xpath = "(//span[@class='ts'])[6]")
    WebElement numberOfMailInTrush;

    public LoginPage(WebDriver webDriverlogin) {
        this.webDriverlogin = webDriverlogin;
        PageFactory.initElements(webDriverlogin, this);
        webDriverlogin.get(loginPageUrl);
    }


    public void enterEmail() throws IOException {
        emailTextBox.sendKeys(readFromProperties.readEmail());
    }

    public void clickNextEmailButton() {
        buttonNextEmail.click();
    }

    public void enterPassword() throws IOException {
        passwordTextBox.sendKeys(readFromProperties.readPasswordAccount());
    }

    public void clickLoginButton() {
        buttonLogin.click();
    }


    public boolean isSelected() {
        return logoGoogle.isDisplayed();
    }

    public void clickButtonWriteMessage() {
        buttonWriteMessage.click();
    }

    public void writeRecipient() throws IOException {
        recipientTextBox.sendKeys(ReadRecipientsContent.readRecipients());
    }

    public void writeSubject() throws IOException {
        subjectTextBox.sendKeys(ReadSubjectContent.readSubjectFile());
    }

    public void writeMessageBody() throws IOException {
        messageBody.sendKeys(ReadEmailContent.readEmailMessage());
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void openLastMailReceived() {
        lastMailReceived.click();
    }

    public void clickDeleteLastMailReceived() {
        deletelastEmailReceived.click();
    }


    public void clickExpandOptions() {
        expandOptions.click();
    }

    public void clickTrashCan() {
        trashCan.click();
    }

    public void clickDeleteButtonTrash(){
        deleteButtonTrash.click();
    }

    public void clickConfirmDelete(){
        webDriverlogin.switchTo().alert();
        confirmDelete.click();
        webDriverlogin.switchTo().defaultContent();
    }

    public void selectCheckBoxDeleteAll() {
        checkBoxDeleteAllFromTrash.click();
    }

    public void clickDeleteAllFromTrash() {
        deleteAllFromTrash.click();
    }

    public Boolean trashIsEmpty(){
        if(numberOfMailInTrush.getSize().equals(0)){
            return true;
        }else{
            return false;
        }


    }
}
