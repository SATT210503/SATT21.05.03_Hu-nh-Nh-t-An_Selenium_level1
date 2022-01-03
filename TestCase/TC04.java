package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC04 extends TestBase{

    @Test(description = "User is redirected to Book ticket page after logging in")
    public void TC04()
    {
        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        LoginPage loginPage = new LoginPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Click on \"Book ticket\" tab");
        generalPage.goToTabBookTicket();

        System.out.println("Login with valid account");
        loginPage.Login(Constant.USERNAME1,Constant.PASSWORD1);

        Assert.assertTrue(loginPage.isBookTicketPageDisplayed());
    }
}
