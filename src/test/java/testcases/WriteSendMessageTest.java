package testcases;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestBase;

import java.io.IOException;

public class WriteSendMessageTest extends TestBase {

    LoginPage loginPage;

    @Test
    public void shouldSuccedToWriteAndSendMessage() throws IOException, InterruptedException {

        //Se incearca/testeaza logarea in cont
        loginPage= new LoginPage(webDriver);

        loginPage.enterEmail();
        Thread.sleep(1500l);
        loginPage.clickNextEmailButton();
        Thread.sleep(1500l);
        loginPage.enterPassword();
        Thread.sleep(1500l);
        loginPage.clickLoginButton();

        //Se testeaza partea de creere a mesajului si trimitere

        Thread.sleep(2000l);
        loginPage.clickButtonWriteMessage();
        Thread.sleep(1500l);
        loginPage.writeRecipient();
        Thread.sleep(1500l);
        loginPage.writeSubject();
        Thread.sleep(1500l);
        loginPage.writeMessageBody();
        Thread.sleep(1500l);
        loginPage.clickSendButton();

    }
}
