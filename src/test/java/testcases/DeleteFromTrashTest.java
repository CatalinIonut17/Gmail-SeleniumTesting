package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestBase;

import java.io.IOException;

public class DeleteFromTrashTest extends TestBase {

    LoginPage loginPage;

    @Test
    public void shouldSuccedDeleteAllFromTrash() throws InterruptedException, IOException {
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

        /// se incearca stergerea tuturor fisierelor din cosul de gunoi
        loginPage.clickExpandOptions();
        Thread.sleep(1500l);
        loginPage.clickTrashCan();
        Thread.sleep(1500l);
        loginPage.selectCheckBoxDeleteAll();
        Thread.sleep(1500l);
        loginPage.clickDeleteAllFromTrash();

        /*loginPage.clickDeleteButtonTrash();
        Thread.sleep(2000l);
        loginPage.clickConfirmDelete();*/


        Assert.assertEquals(loginPage.trashIsEmpty(), 0);
    }

}
