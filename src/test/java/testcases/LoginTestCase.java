package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestBase;

import java.io.IOException;

public class LoginTestCase extends TestBase {

    LoginPage loginPage;

    @Test
    public void shouldSuccedLoginAccount() throws IOException, InterruptedException {

        loginPage= new LoginPage(webDriver);

        loginPage.enterEmail();
        Thread.sleep(1500l);
        loginPage.clickNextEmailButton();
        Thread.sleep(1500l);
        loginPage.enterPassword();
        Thread.sleep(1500l);
        loginPage.clickLoginButton();
        Thread.sleep(2000l);
        Assert.assertTrue(loginPage.isSelected());

    }

}
