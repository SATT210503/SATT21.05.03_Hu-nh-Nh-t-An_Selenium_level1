package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.annotations.Test;

public class TC14 extends TestBase{

    @Test
    public void TC14()
    {
        HomePage homePage = new HomePage();
        homePage.open();

        GeneralPage lgp = new GeneralPage();
        lgp.goToTabLogin();

        LoginPage lg = new LoginPage();
        lg.Login(Constant.USERNAME1,Constant.PASSWORD1);

        GeneralPage btp = new GeneralPage();
        btp.goToTabBookTicket();



        LoginPage bt = new LoginPage();
        bt.BookTickt();





    }
}
