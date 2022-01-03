package TestCase;

import Constant.Constant;
import Railway.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC17 extends TestBase{

    @Test(description = "User can't book more than 10 tickets")
    public void TC17()
    {
        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        LoginPage loginPage = new LoginPage();
        BookTicketPage bookTicketPage = new BookTicketPage();
        MyTicketPage myTicketPage = new MyTicketPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Login with a valid account");
        generalPage.goToTabLogin();
        loginPage.Login(Constant.USERNAME1, Constant.PASSWORD1);

        System.out.println("Click on \"Book ticket\" tab");
        generalPage.goToTabBookTicket();

        System.out.println("Book 10 tickets");
        bookTicketPage.bookTicketMultiple("1/8/2022","Quảng Ngãi", "Huế", "Hard seat", "1",10);

        System.out.println("Click on \"Book ticket\" tab again");
        generalPage.goToTabBookTicket();

        System.out.println("Book one more ticket");
        bookTicketPage.bookTicket("1/8/2022","Quảng Ngãi", "Huế", "Hard seat", "1");

        String actualMsg1 = generalPage.getTicketAmountErrorMsg();
        String expectMsg1 = "There're errors in the form. Please correct the errors and try again.";

        Assert.assertEquals(actualMsg1,expectMsg1);

        String actualMsg2 = generalPage.getTicketAmountFieldErroeMsg();
        String expectMsg2 = "You have booked 10 tickets. You can book no more.";

        Assert.assertEquals(actualMsg2,expectMsg2);
    }
}
