import Constant.Constant;
import Railway.HomePage;
import Railway.LoginPage;
import Railway.GeneralPage;

public class TestCase extends LoginTest {
    public void TC01()
    {
        beforeMethod();
        System.out.println("TC01 - User can log into Railway with valid username and password");
        HomePage homePage =new HomePage();
        homePage.open();

        LoginPage loginPage = homePage.gotoLoginPage();
        String actualMsg = loginPage.Login(Constant.USERNAME1,Constant.PASSWORD1).getWelcomeMsg();
        String expectMsg = "Welcome"+Constant.USERNAME1;
        afterMethod();

    }

    public void TC02()
    {
        beforeMethod();
        System.out.println("TC02 - User can't login with blank Username textbox");
        HomePage homePage =new HomePage();
        homePage.open();

        LoginPage loginPage = homePage.gotoLoginPage();
        String actualMsg = loginPage.Login(Constant.USERNAME2,Constant.PASSWORD2).getLoginErrorMsg();

        afterMethod();

    }

    public void TC03()
    {
        beforeMethod();
        System.out.println("TC02 - User can't login with blank Username textbox");
        HomePage homePage =new HomePage();
        homePage.open();

        LoginPage loginPage = homePage.gotoLoginPage();
        String actualMsg = loginPage.Login(Constant.USERNAME3,Constant.PASSWORD3).getLoginErrorMsg();

        afterMethod();

    }
}
