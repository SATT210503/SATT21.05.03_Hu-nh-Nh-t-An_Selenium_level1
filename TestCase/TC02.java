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
        System.out.println("Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("Click on \"Login\" tab");
        GeneralPage gotoTablogin = new GeneralPage();
        gotoTablogin.goToTabLogin();

        System.out.println("User doesn't type any words into \"Username\" textbox but enter valid information into \"Password\" textbox ");
        System.out.println("Click on \"Login\" button");
        LoginPage login = new LoginPage();
        login.Login(Constant.USERNAME2,Constant.PASSWORD2);

        String actualMsg = login.getLoginErrorMsg();
        String expectMsg = "There was a problem with your login and/or errors exist in your form.";

        Assert.assertEquals(actualMsg,expectMsg,"Error message is not displayed as expected");
    }
}
