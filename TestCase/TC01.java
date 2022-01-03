package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01 extends TestBase {

    @Test(description = "TC01 - User can log into Railway with valid username and password")
    public void tc01()
    {
        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        LoginPage loginPage = new LoginPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Click on \"Login\" tab");
        generalPage.goToTabLogin();

        System.out.println("Enter valid Email and Password and Click on \"Login\" button");
        loginPage.Login(Constant.USERNAME1,Constant.PASSWORD1);

        String actualMsg = loginPage.getWelcomeMsg();
        String expectMsg = "Welcome " + Constant.USERNAME1;

        Assert.assertEquals(actualMsg,expectMsg,"Welcome message is not displayed as expected");
    }
}
