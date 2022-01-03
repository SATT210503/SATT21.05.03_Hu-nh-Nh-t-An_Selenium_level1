package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07 extends TestBase{

    @Test(description = "User can create new account")
    public void TC07()
    {
        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        RegisterPage registerPage = new RegisterPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Click on \"Register\" tab");
        generalPage.goToTabRegister();

        System.out.println("Enter valid information into all fields");
        System.out.println("Click on \"Register\" button");
        registerPage.Register(Constant.EMAIL,Constant.PASSWORD,Constant.CONFIRMPASSWORD,Constant.PID);

        String actualMsg = registerPage.getRegisterSuccessMsg();
        String expectMsg = "Thank you for registering your account";

        Assert.assertEquals(actualMsg,expectMsg,"Welcome message is not displayed as expected");
    }
}
