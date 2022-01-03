package TestCase;

import Constant.Constant;
import Railway.*;
import org.testng.annotations.Test;



public class TC16 extends TestBase{

    @Test(description = "User can cancel a ticket")
    public void TC16()
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

        System.out.println("Book a ticket");
        generalPage.goToTabBookTicket();
        bookTicketPage.bookTicket("1/8/2022","Quảng Ngãi", "Huế", "Hard seat", "1");

        System.out.println(" Click on \"My ticket\" tab");
        generalPage.goToTabMyTicket();

        System.out.println("Click on \"Cancel\" button of ticket which user want to cancel.");
        System.out.println("Click on \"OK\" button on Confirmation message \"Are you sure?\"");
        myTicketPage.Cancel();

    }
}
