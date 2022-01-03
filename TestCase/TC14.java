package TestCase;

import Constant.Constant;
import Constant.DataUtil;
import Railway.BookTicketPage;
import Railway.GeneralPage;
import Railway.HomePage;
import Railway.LoginPage;
import org.testng.annotations.Test;


public class TC14 extends TestBase{

    @Test(description = "User can book many tickets at a time", dataProviderClass = DataUtil.class, dataProvider = "dataProvider")
    public void TC14(String data)
    {
        String[] bookTicketForm = data.split(",");

        HomePage homePage = new HomePage();
        GeneralPage generalPage = new GeneralPage();
        LoginPage loginPage = new LoginPage();
        BookTicketPage bookTicketPage = new BookTicketPage();

        System.out.println("Navigate to QA Railway Website");
        homePage.open();

        System.out.println("Login with a valid account ");
        generalPage.goToTabLogin();
        loginPage.Login(Constant.USERNAME1,Constant.PASSWORD1);

        System.out.println(" Click on \"Book ticket\" tab");
        generalPage.goToTabBookTicket();

        System.out.println("Select a \"Depart date\" from the list");
        bookTicketPage.selectDate(bookTicketForm[0]);

        System.out.println("Select \"Quang Ngai\" for \"Depart from\" and \"Hue\" for \"Arrive at\".");
        bookTicketPage.selectDepart(bookTicketForm[1]);
        bookTicketPage.selectArrive(bookTicketForm[2]);

        System.out.println("Select \"Soft seat with air conditioner\" for \"Seat type\"");
        bookTicketPage.selectSeatType(bookTicketForm[3]);

        System.out.println(" Select \"4\" for \"Ticket amount\"");
        bookTicketPage.selectTicketAmount(bookTicketForm[4]);

        System.out.println("Click on \"Book ticket\" button");
        bookTicketPage.getBtnBookTicket().click();





    }
}
