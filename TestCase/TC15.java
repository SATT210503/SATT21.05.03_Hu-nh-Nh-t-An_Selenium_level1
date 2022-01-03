package TestCase;

import Constant.Constant;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import Railway.TimeTablePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC15 extends TestBase{

    @Test(description = "")
    public void TC15()
    {
        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        LoginPage loginPage = new LoginPage();
        TimeTablePage timeTablePage = new TimeTablePage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Login with a valid account");
        generalPage.goToTabLogin();
        loginPage.Login(Constant.USERNAME1, Constant.PASSWORD1);

        System.out.println("Click on \"Timetable\" tab");
        generalPage.goToTabTimeTable();
        timeTablePage.clickCheckPrice();

        Assert.assertTrue(generalPage.isTicketPricePageDisplayed());

        String actually = timeTablePage.getTicketPriceTitle();
        String expected = "Ticket price from Đà Nẵng to Quảng Ngãi";

        Assert.assertEquals(actually,expected);

        String actually1 = timeTablePage.getSeatTypeHS() + "=" + timeTablePage.getPriceHS();
        String expected1 = "HS=300000";

        Assert.assertEquals(actually1,expected1);


    }
}
