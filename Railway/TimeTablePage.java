package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TimeTablePage extends GeneralPage
{

    private final By lnkCheckPriceDNandQN = By.xpath("//a[@href='TicketPricePage.cshtml?id1=4&id2=6']");
    private final By tblTicketPriceTitle = By.xpath("//tr[@class='TableSmallHeader']/th[text()]");
    private final By seatTypeHS = By.xpath("//th[@class='RowHeader']/../td[text()='HS']");
    private final By seatTypeSS = By.xpath("//th[@class='RowHeader']/../td[text()='SS']");
    private final By seatTypeSSC = By.xpath("//th[@class='RowHeader']/../td[text()='SSC']");
    private final By seatTypeHB = By.xpath("//th[@class='RowHeader']/../td[text()='HD']");
    private final By seatTypeSB = By.xpath("//th[@class='RowHeader']/../td[text()='SB']");
    private final By seatTypeSBC = By.xpath("//th[@class='RowHeader']/../td[text()='SBC']");
    private final By priceHS = By.xpath("//th[@class='RowHeader']/../td[text()='300000']");
    private final By priceSS = By.xpath("//th[@class='RowHeader']/../td[text()='325000']");
    private final By priceSSC = By.xpath("//th[@class='RowHeader']/../td[text()='350000C']");
    private final By priceHB = By.xpath("//th[@class='RowHeader']/../td[text()='400000']");
    private final By priceSB = By.xpath("//th[@class='RowHeader']/../td[text()='450000']");
    private final By priceSBC = By.xpath("//th[@class='RowHeader']/../td[text()='500000']");

    public WebElement getSeatType_HS()
    {
        return Constant.WEDBRIVER.findElement(seatTypeHS);
    }

    public WebElement getSeatType_SS()
    {
        return Constant.WEDBRIVER.findElement(seatTypeSS);
    }

    public WebElement getSeatType_SSC()
    {
        return Constant.WEDBRIVER.findElement(seatTypeSSC);
    }

    public WebElement getSeatType_HB()
    {
        return Constant.WEDBRIVER.findElement(seatTypeHB);
    }

    public WebElement getSeatType_SB()
    {
        return Constant.WEDBRIVER.findElement(seatTypeSB);
    }

    public WebElement getSeatType_SBC()
    {
        return Constant.WEDBRIVER.findElement(seatTypeSBC);
    }

    public WebElement getPrice_HS()
    {
        return Constant.WEDBRIVER.findElement(priceHS);
    }

    public WebElement getPrice_SS()
    {
        return Constant.WEDBRIVER.findElement(priceSS);
    }

    public WebElement getPrice_SSC()
    {
        return Constant.WEDBRIVER.findElement(priceSSC);
    }

    public WebElement getPrice_HB()
    {
        return Constant.WEDBRIVER.findElement(priceHB);
    }

    public WebElement getPrice_SB()
    {
        return Constant.WEDBRIVER.findElement(priceSB);
    }

    public WebElement getPrice_SBC()
    {
        return Constant.WEDBRIVER.findElement(priceSBC);
    }

    public WebElement getTblTicketPriceTitle()
    {
        return Constant.WEDBRIVER.findElement(tblTicketPriceTitle);
    }

    public String getSeatTypeHS()
    {
        return this.getSeatType_HS().getText();
    }

    public String getSeatTypeSS()
    {
        return this.getSeatType_SS().getText();
    }

    public String getSeatTypeSSC()
    {
        return this.getSeatType_SSC().getText();
    }

    public String getSeatTypeHB()
    {
       return this.getSeatType_HB().getText();
    }

    public String getSeatTypeSB()
    {
        return this.getSeatType_SB().getText();
    }

    public String getSeatTypeSBHC()
    {
        return this.getSeatType_SBC().getText();
    }

    public String getPriceHS()
    {
        return this.getPrice_HS().getText();
    }

    public String getPriceSS()
    {
        return this.getPrice_SS().getText();
    }

    public String getPriceSSC()
    {
        return this.getPrice_SSC().getText();
    }

    public String getPriceHB()
    {
        return this.getPrice_HB().getText();
    }

    public String getPriceSB()
    {
        return this.getPrice_SB().getText();
    }

    public String getPriceSBC()
    {
        return this.getPrice_SBC().getText();
    }

    public String getTicketPriceTitle()
    {
        return this.getTblTicketPriceTitle().getText();
    }

    public void clickCheckPrice()
    {
        this.Scroll();
        Constant.WEDBRIVER.findElement(lnkCheckPriceDNandQN).click();
    }
}


