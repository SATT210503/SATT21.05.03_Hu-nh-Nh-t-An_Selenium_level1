package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC06 extends TestBase{

    @Test(description = "User is redirected to Home page after logging out")
    public void TC06()
    {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        GeneralPage generalPage = new GeneralPage();

        System.out.println(" Navigate to QA Railway Website");
        homePage.open();

        generalPage.goToTabLogin();

        System.out.println("Login with valid Email and Password");
        loginPage.Login(Constant.USERNAME1,Constant.PASSWORD1);

        System.out.println("Click on \"Contact\" tab");
        generalPage.goToTabContact();

        System.out.println("Click on \"Log out\" tab");
        generalPage.goToTabLogout();

        Assert.assertTrue(homePage.isHomePageDisplayed());
        Assert.assertFalse(generalPage.isLogoutPageDisplayed());

    }
}
