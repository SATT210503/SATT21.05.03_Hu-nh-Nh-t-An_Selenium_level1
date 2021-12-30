package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03 extends TestBase{

    @Test(description = "TC03 - User cannot log into Railway with invalid password  ")
    public void tc03()
    {
        System.out.println("Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("Click on \"Login\" tab");
        GeneralPage gotoTablogin = new GeneralPage();
        gotoTablogin.goToTabLogin();

        System.out.println("Enter valid Email and invalid Password ");
        System.out.println("Click on \"Login\" button");
        LoginPage login = new LoginPage();
        login.Login(Constant.USERNAME3,Constant.PASSWORD3);

        String actualMsg = login.getLoginErrorMsg();
        String expectMsg = " There was a problem with your login and/or errors exist in your form. ";

        Assert.assertEquals(actualMsg,expectMsg,"Error message is not displayed as expected");
    }
}
