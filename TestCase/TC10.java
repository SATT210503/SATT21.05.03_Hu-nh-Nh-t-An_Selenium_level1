package TestCase;

import Constant.Constant;
import Railway.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC10 extends TestBase{

    @Test(description = "User can't create account with an already in-use email")
    public void TC10()
    {
        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        ChangePasswordPage changePasswordPage = new ChangePasswordPage();
        RegisterPage registerPage = new RegisterPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Click on \"Register\" tab");
        generalPage.goToTabRegister();

        System.out.println(" Enter information of the created account in Pre-condition");
        System.out.println("Click on \"Register\" button");
        registerPage.Register(Constant.EMAIL_TC10, Constant.PASSWORD_TC10, Constant.CONFIRMPASSWORD_TC10, Constant.PID_T10);

        String actualMsg = registerPage.getRegisterErrorMsg();
        String expectMsg = "This email address is already in use.";

        Assert.assertEquals(actualMsg,expectMsg,"Error message is not displayed as expected");
    }
}
