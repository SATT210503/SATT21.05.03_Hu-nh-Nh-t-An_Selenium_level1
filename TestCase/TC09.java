package TestCase;

import Constant.Constant;
import Railway.ChangePasswordPage;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09 extends TestBase{


    @Test(description = "User can't change password when \"New Password\" and \"Confirm Password\" are different.")
    public void TC09()
    {

        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        LoginPage loginPage = new LoginPage();
        ChangePasswordPage changePasswordPage = new ChangePasswordPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        generalPage.goToTabLogin();

        System.out.println("Login with a valid account ");
        loginPage.Login(Constant.USERNAME1, Constant.PASSWORD1);

        System.out.println("Click on \"Change Password\" tab");
        generalPage.goToTabChangePassword();

        changePasswordPage.ChangePassword(Constant.CURRENTPASSWORD_TC09, Constant.NEWPASSWORD_TC09, Constant.CONFIRMPASSWORD_TC09);

        String actualMsg1 = changePasswordPage.getChangePassFailMsg();
        String expectMsg1 = "Password change failed. Please correct the errors and try again.";

        String actualMsg2 = changePasswordPage.getConfirmFieldErrorMsg();
        String expectMsg2 = "The password confirmation does not match the new password.";

        Assert.assertEquals(actualMsg1,expectMsg1,"Error message is not displayed as expected");
        Assert.assertEquals(actualMsg2,expectMsg2,"Error message is not displayed as expected");
    }
}
