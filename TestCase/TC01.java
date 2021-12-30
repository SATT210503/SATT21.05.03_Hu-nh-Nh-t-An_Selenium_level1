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
        System.out.println("Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("Click on \"Login\" tab");
        GeneralPage gotoTablogin = new GeneralPage();
        gotoTablogin.goToTabLogin();

        System.out.println("Enter valid Email and Password and Click on \"Login\" button");
        LoginPage login = new LoginPage();
        login.Login(Constant.USERNAME1,Constant.PASSWORD1);

        String actualMsg = login.getWelcomeMsg();
        String expectMsg = "Welcome " + Constant.USERNAME1;

        Assert.assertEquals(actualMsg,expectMsg,"Welcome message is not displayed as expected");
    }
}
