package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends TestBase {

    @Test(description = "TC02 - User can't login with blank \"Username\" textbox")
    public void tc02()
    {
        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        LoginPage loginPage = new LoginPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Click on \"Login\" tab");
        generalPage.goToTabLogin();

        System.out.println("User doesn't type any words into \"Username\" textbox but enter valid information into \"Password\" textbox ");
        System.out.println("Click on \"Login\" button");
        loginPage.Login(Constant.USERNAME2,Constant.PASSWORD2);

        String actualMsg = loginPage.getLoginErrorMsg();
        String expectMsg = "There was a problem with your loginPage and/or errors exist in your form.";

        Assert.assertEquals(actualMsg,expectMsg,"Error message is not displayed as expected");
    }
}
