package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class TC16 extends TestBase{

    @Test
    public void TC16()
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

        GeneralPage mt = new GeneralPage();
        mt.goToTabMyTicket();

        LoginPage sr = new LoginPage();
        sr.Scroll();
        sr.Scroll1();

        LoginPage cn = new LoginPage();
        cn.Cancel();
        Constant.WEDBRIVER.switchTo().alert().accept();
    }
}
