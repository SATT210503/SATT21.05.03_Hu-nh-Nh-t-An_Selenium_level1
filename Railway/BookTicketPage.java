package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookTicketPage extends GeneralPage{

    private final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    private final By lstDepart = By.name("DepartStation");
    private final By lstArrive = By.name("ArriveStation");
    private final By lstSeatType = By.name("SeatType");
    private final By lstDate = By.name("Date");
    private final By lstTicketAmount = By.name("TicketAmount");
    private final By lblBookTicketErrorMsg = By.xpath("//p[@class ='message error']");
    private final By lblTicketAmountFieldErrorMsg = By.xpath("//label[@class='validation-error' and text()]");

    public WebElement getBtnBookTicket() {
        return Constant.WEDBRIVER.findElement(btnBookTicket);
    }

    public WebElement getLstDepart() {
        return Constant.WEDBRIVER.findElement(lstDepart);
    }

    public WebElement getLstArrive() {
        return Constant.WEDBRIVER.findElement(lstArrive);
    }

    public WebElement getLstSeatType() {
        return Constant.WEDBRIVER.findElement(lstSeatType);
    }

    public WebElement getLstDate() {
        return Constant.WEDBRIVER.findElement(lstDate);
    }

    public WebElement getLstTicketAmount() {
        return Constant.WEDBRIVER.findElement(lstTicketAmount);
    }



    public void selectDate(String Date) {
        Select dt = new Select(this.getLstDate());
        dt.selectByVisibleText(Date);
    }

    public void selectDepart(String depart) {
        Select ds = new Select(this.getLstDepart());
        ds.selectByVisibleText(depart);
        //stations.selectByIndex(6);
    }

    public void selectArrive(String arrive) {
        Select as = new Select(this.getLstArrive());
        as.selectByVisibleText(arrive);
        //stations.selectByIndex(5);
    }

    public void selectSeatType(String type) {
        Select ts= new Select(this.getLstSeatType());
        ts.selectByVisibleText(type);
        //stations.selectByIndex(3);
    }

    public void selectTicketAmount(String number) {
        Select stations = new Select(this.getLstTicketAmount());
        stations.selectByVisibleText(number);
        //stations.selectByIndex(3);
    }

    public void bookTicket(String Departdate, String Departfrom, String Arriveat, String SeatType ,String Ticketamount)
    {
        this.Scroll();
        this.selectDate(Departdate);
        this.selectDepart(Departfrom);
        this.selectArrive(Arriveat);
        this.selectSeatType(SeatType);
        this.selectTicketAmount(Ticketamount);
        Constant.WEDBRIVER.findElement(btnBookTicket).click();
    }

    public void bookTicketMultiple(String Departdate, String Departfrom, String Arriveat, String SeatType ,String Ticketamount, int times)
    {

        GeneralPage generalPage = new GeneralPage();
        this.Scroll();
        for(int i= 1; i<= times; i++)
        {
            generalPage.goToTabBookTicket();
            this.selectDate(Departdate);
            this.selectDepart(Departfrom);
            this.selectArrive(Arriveat);
            this.selectSeatType(SeatType);
            this.selectTicketAmount(Ticketamount);
            Constant.WEDBRIVER.findElement(btnBookTicket).click();
        }
    }

}
