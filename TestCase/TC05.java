package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05 extends TestBase{

    @Test(description = "System shows message when user enters wrong password several times")
    public void TC05()
    {
        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        LoginPage loginPage = new LoginPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Click on \"Login\" tab");
        generalPage.goToTabLogin();

        System.out.println("Enter valid information into \"Username\" textbox except \"Password\" textbox.");
        System.out.println("Click on \"Login\" button");
        System.out.println("Repeat step 3 three more times.");
        loginPage.LoginMultiple(Constant.USERNAME3,Constant.PASSWORD3,3);

        String actualMsg = loginPage.getLoginErrorMsg();
        String expectMsg = "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";

        Assert.assertEquals(expectMsg,actualMsg);
    }
}
