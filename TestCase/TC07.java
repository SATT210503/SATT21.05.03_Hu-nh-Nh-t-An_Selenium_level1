package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07 extends TestBase{

    @Test(description = "User can create new account")
    public void TC07()
    {
        System.out.println("Navigate to QA Railway Website");
        HomePage homePage =new HomePage();
        homePage.open();

        System.out.println("Click on \"Register\" tab");
        GeneralPage run = new GeneralPage();
        run.goToTabRegister();

        System.out.println("Enter valid information into all fields");
        System.out.println("Click on \"Register\" button");

        LoginPage reg =new LoginPage();
        reg.Register(Constant.EMAIL,Constant.PASSWORD,Constant.CONFIRMPASSWORD,Constant.PID);

        String actualMsg = reg.getRegisterSuccessMsg();
        String expectMsg = "Thank you for registering your account";

        Assert.assertEquals(actualMsg,expectMsg,"Welcome message is not displayed as expected");
    }
}
