package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC10 extends TestBase{

    @Test
    public void TC10()
    {
        HomePage homePage = new HomePage();
        homePage.open();

        GeneralPage lgp = new GeneralPage();
        lgp.goToTabLogin();

        LoginPage lg = new LoginPage();
        lg.Login(Constant.USERNAME1, Constant.PASSWORD1);

        GeneralPage GCP = new GeneralPage();
        GCP.goToTabChangePassword();

        LoginPage CP = new LoginPage();
        CP.ChangePassword(Constant.CURRENTPASSWORD1, Constant.NEWPASSWORD1, Constant.CONFIRMPASSWORD2);

        String actualMsg = CP.getChangePassFailMsg();
        String expectMsg = "There're errors in the form. Please correct the errors and try again.";

        Assert.assertEquals(actualMsg,expectMsg,"Error message is not displayed as expected");
    }
}
