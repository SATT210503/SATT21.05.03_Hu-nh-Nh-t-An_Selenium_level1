package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05 extends TestBase{

    @Test(description = "System shows message when user enters wrong password several times")
    public void TC05(){
        System.out.println("Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("Click on \"Login\" tab");
        GeneralPage gotoTablogin = new GeneralPage();
        gotoTablogin.goToTabLogin();

        System.out.println("Enter valid information into \"Username\" textbox except \"Password\" textbox.");
        System.out.println("Click on \"Login\" button");
        System.out.println("Repeat step 3 three more times.");
        LoginPage loginMul = new LoginPage();
        loginMul.LoginMultiple(Constant.USERNAME3,Constant.PASSWORD3,3);

        String actualMsg = loginMul.getLoginErrorMsg();
        String expectMsg = "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";

        Assert.assertEquals(expectMsg,actualMsg);
    }
}
