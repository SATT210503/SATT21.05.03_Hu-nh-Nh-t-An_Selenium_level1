package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09 extends TestBase{

    @Test
    public void TC09()
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
        CP.ChangePassword(Constant.CURRENTPASSWORD, Constant.NEWPASSWORD, Constant.CONFIRMPASSWORD1);

        String actualMsg = CP.getChangePassSuccessMsg();
        String expectMsg = "Your password has been updated";

        Assert.assertEquals(actualMsg,expectMsg,"Error message is not displayed as expected");
    }
}
