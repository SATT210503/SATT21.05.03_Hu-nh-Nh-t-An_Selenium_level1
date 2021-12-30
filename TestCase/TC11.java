package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC11 extends TestBase{

    @Test
    public void TC11()
    {
        HomePage homePage = new HomePage();
        homePage.open();

        GeneralPage lgp = new GeneralPage();
        lgp.goToTabRegister();

        LoginPage rp = new LoginPage();
        rp.Register(Constant.EMAIL11, Constant.PASSWORD11,Constant.CONFIRMPASSWORD11,Constant.PID11);

        String actualMsg = rp.getChangePassFailMsg();
        String expectMsg = "There're errors in the form. Please correct the errors and try again.";

        Assert.assertEquals(actualMsg,expectMsg,"Error message is not displayed as expected");

        LoginPage scroll = new LoginPage();
        scroll.Scroll();

        String actualMsg1 = rp.getPasswordFieldErrorMsg();
        String expectMsg1 = "Invalid password length.";

        Assert.assertEquals(actualMsg1,expectMsg1,"Error message is not displayed as expected");

        String actualMsg2 = rp.getPIDFieldErrorMsg();
        String expectMsg2 = "Invalid ID length.";

        Assert.assertEquals(actualMsg2,expectMsg2,"Error message is not displayed as expected");

    }
}
