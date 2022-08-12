package testcases;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestBase;

import java.io.IOException;

public class OpenDeleteLastMailTest extends TestBase {
    LoginPage loginPage;

    @Test
    public void shouldSuccedOpenDeleteLastMail() throws InterruptedException, IOException {

        loginPage= new LoginPage(webDriver);

        //se incearca conectarea
        loginPage.enterEmail();
        Thread.sleep(1500l);
        loginPage.clickNextEmailButton();
        Thread.sleep(1500l);
        loginPage.enterPassword();
        Thread.sleep(1500l);
        loginPage.clickLoginButton();
        Thread.sleep(1500l);

        //se incearca deschiderea si stergerea ultimului mail primit
        loginPage.openLastMailReceived();
        Thread.sleep(1500l);
        loginPage.clickDeleteLastMailReceived();


    }
}