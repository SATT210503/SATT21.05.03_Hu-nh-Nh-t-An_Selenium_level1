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
        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        LoginPage loginPage = new LoginPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Click on \"Login\" tab");
        generalPage.goToTabLogin();

        System.out.println("Enter valid Email and invalid Password ");
        System.out.println("Click on \"Login\" button");
        loginPage.Login(Constant.USERNAME3,Constant.PASSWORD3);

        String actualMsg = loginPage.getLoginErrorMsg();
        String expectMsg = " There was a problem with your loginPage and/or errors exist in your form. ";

        Assert.assertEquals(actualMsg,expectMsg,"Error message is not displayed as expected");
    }
}
