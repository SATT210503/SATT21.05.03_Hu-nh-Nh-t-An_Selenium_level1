package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import Railway.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC11 extends TestBase{

    @Test(description = "User can't create account while password and PID fields are empty")
    public void TC11()
    {
        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        RegisterPage registerPage = new RegisterPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Click on \"Register\" tab");
        generalPage.goToTabRegister();

        System.out.println("Enter valid email address and leave other fields empty");
        System.out.println("Click on \"Register\" button");
        registerPage.Register(Constant.EMAIL_TC11, Constant.PASSWORD_TC11,Constant.CONFIRMPASSWORD_TC11,Constant.PID_TC11);

        String actualMsg = registerPage.getChangePassFailMsg();
        String expectMsg = "There're errors in the form. Please correct the errors and try again.";

        Assert.assertEquals(actualMsg,expectMsg,"Error message is not displayed as expected");

        String actualMsg1 = registerPage.getPasswordFieldErrorMsg();
        String expectMsg1 = "Invalid password length.";

        Assert.assertEquals(actualMsg1,expectMsg1,"Error message is not displayed as expected");

        String actualMsg2 = registerPage.getPIDFieldErrorMsg();
        String expectMsg2 = "Invalid ID length.";

        Assert.assertEquals(actualMsg2,expectMsg2,"Error message is not displayed as expected");

    }
}
