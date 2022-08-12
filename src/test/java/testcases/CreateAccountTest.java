package testcases;

import org.testng.annotations.Test;
import pages.CreateAccountPage;
import utils.TestBase;

import java.io.IOException;

public class CreateAccountTest extends TestBase {

    CreateAccountPage createAccountPage;

    @Test
    public void shouldSuccedCreateAccount() throws IOException, InterruptedException {

        createAccountPage= new CreateAccountPage(webDriver);
        createAccountPage.clickOnCreateAccountButton();
        Thread.sleep(1000l);
        createAccountPage.enterDateOnFirstPage();
        Thread.sleep(1500l);
        createAccountPage.clickOnButtonInformationAccount();
        Thread.sleep(1500l);
        createAccountPage.enterPhoneNumber();
        Thread.sleep(2000l);
        createAccountPage.clickOnButtonPhoneNumber();

        Thread.sleep(20000l); // am pus acest Thread.sleep pentru a introduce codul primit pe telefon

        createAccountPage.clickOnButtonConfirmNumber();
        Thread.sleep(2000l);
        createAccountPage.enterBirthdayDetailsAndGender();
        Thread.sleep(2000l);
        createAccountPage.clickButtonBirthdayGender();
        Thread.sleep(2000l);
        createAccountPage.clickButtonAcceptBenefits();
        Thread.sleep(2000l);
        createAccountPage.selectCheckBoxCustomization();
        Thread.sleep(2000l);
        createAccountPage.clickButtonCustomization();
        Thread.sleep(2000l);
        createAccountPage.clickConfirmButtonSettings();
        Thread.sleep(2000l);
        createAccountPage.clickAgreeButtonCreateAccount();

    }
}
