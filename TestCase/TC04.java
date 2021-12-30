package TestCase;

import Railway.GeneralPage;
import Railway.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC04 extends TestBase{

    @Test(description = "Login page displays when un-logged User clicks on \"Book ticket\" tab")
    public void TC04(){
        System.out.println("Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("Click on \"Book ticket\" tab");
        GeneralPage bookticket = new GeneralPage();
        bookticket.goToTabBookTicket();

        String actualMsg = bookticket.getWelcomeMsg();
        String expectMsg = "Welcome guest!";

        Assert.assertEquals(actualMsg,expectMsg);
    }
}
