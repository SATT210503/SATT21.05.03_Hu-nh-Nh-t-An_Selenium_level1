package Railway;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class GeneralPage {

    //Locators
    private final By tabHomePage = By.xpath("//a[@href = '../']");
    private final By tabContact = By.xpath("//a[@href = '/Page/Contact.cshtml']");
    private final By tabLogin = By.xpath("//a[@href = '/Account/Login.cshtml']");
    private final By tabBookTicket = By.xpath("//a[@href='/Page/BookTicketPage.cshtml']");
    private final By tabTickPrice = By.xpath("//a[@href='/Page/TrainPriceListPage.cshtml']");
    private final By tabRegister = By.xpath("//a[@href = '/Account/Register.cshtml']");
    private final By tabChangePassword = By.xpath("//a[@href = '/Account/ChangePassword.cshtml']");
    private final By tabMyTicket = By.xpath("//a[@href ='/Page/ManageTicket.cshtml']");
    private final By tabTimeTable = By.xpath("//a[@href ='TrainTimeListPage.cshtml']");
    private final By tabLogout = By.xpath("//a[@href = '/Account/Logout']");
    private final By lblWelcomeMsg = By.xpath("//div[@class='account']/strong");
    private final By lblLoginErrorMsg = By.xpath("//p[@class='message error LoginForm' and text()]");
    private final By lblRegisterErrorMsg = By.xpath("//div[@id ='content']/p[@class='message error']");
    private final By lblRegisterSuccessMsg = By.xpath("//div[@id='content' ]/p[text()]");
    private final By lblChangePassSuccessMsg = By.xpath("//form[@method='post']//p[@class='message success' and text()]");
    private final By lblChangePassFailMsg = By.xpath("//p[@class='message error' and text()]");
    private final By lblConfirmFieldErrorMsg = By.xpath("//label[@for='confirmPassword' and @class='validation-error']");
    private final By lblPasswordFieldErrorMsg = By.xpath("//label[@for='password' and @class='validation-error']");
    private final By lblPIDFieldErrorMsg = By.xpath("//label[@for='pid' and @class='validation-error' and text()]");
    private final By lblBookTicketErrorMsg = By.xpath("//p[@class ='message error']");
    private final By lblTicketAmountFieldErrorMsg = By.xpath("//label[@class='validation-error' and text()]");

    //Elements
    public WebElement getTabLoginPage()
    {
        return Constant.WEDBRIVER.findElement(tabLogin);
    }

    public WebElement getTabLogout()
    {
        return Constant.WEDBRIVER.findElement(tabLogout);
    }

    public WebElement getTabBookTicket()
    {
        return Constant.WEDBRIVER.findElement(tabBookTicket);
    }

    public WebElement getTabTimeTable()
    {
        return Constant.WEDBRIVER.findElement(tabTimeTable);
    }

    public WebElement getTabTicketPrice()
    {
        return Constant.WEDBRIVER.findElement(tabTickPrice);
    }

    public WebElement getLblWelcomeMsg()
    {
        return Constant.WEDBRIVER.findElement(lblWelcomeMsg);
    }

    public WebElement getLblLoginErrorMsg()
    {
        return Constant.WEDBRIVER.findElement(lblLoginErrorMsg);
    }

    public WebElement getLblRegisterSuccessMsg()
    {
        return Constant.WEDBRIVER.findElement(lblRegisterSuccessMsg);
    }

    public WebElement getLblChangePassSuccessMsg()
    {
        return Constant.WEDBRIVER.findElement(lblChangePassSuccessMsg);
    }

    public WebElement getLblChangePassFailMsg()
    {
        return Constant.WEDBRIVER.findElement(lblChangePassFailMsg);
    }

    public WebElement getLblPasswordFieldErrorMsg()
    {
        return Constant.WEDBRIVER.findElement(lblPasswordFieldErrorMsg);
    }

    public WebElement getLblConfirmFieldErrorMsg()
    {
        return Constant.WEDBRIVER.findElement(lblConfirmFieldErrorMsg);
    }

    public WebElement getLblPIDFieldErrorMsg()
    {
        return Constant.WEDBRIVER.findElement(lblPIDFieldErrorMsg);
    }

    public WebElement getLblRegisterErrorMsg()
    {
        return Constant.WEDBRIVER.findElement(lblRegisterErrorMsg);
    }

    public WebElement getLblTicketAmountErrorMsg()
    {
        return Constant.WEDBRIVER.findElement(lblBookTicketErrorMsg);
    }

    public WebElement getLblTicketAmountFieldErrorMsg()
    {
        return Constant.WEDBRIVER.findElement(lblTicketAmountFieldErrorMsg);
    }

    //Method
    public String getWelcomeMsg()
    {
        return this.getLblWelcomeMsg().getText();
    }

    public String getLoginErrorMsg()
    {
        return this.getLblLoginErrorMsg().getText();
    }

    public String getRegisterSuccessMsg()
    {
        return this.getLblRegisterSuccessMsg().getText();
    }

    public String getChangePassSuccessMsg()
    {
        return this.getLblChangePassSuccessMsg().getText();
    }

    public String getChangePassFailMsg()
    {
        return this.getLblChangePassFailMsg().getText();
    }

    public String getPasswordFieldErrorMsg()
    {
        return this.getLblPasswordFieldErrorMsg().getText();
    }

    public String getConfirmFieldErrorMsg()
    {
        return this.getLblConfirmFieldErrorMsg().getText();
    }

    public String getPIDFieldErrorMsg()
    {
        return this.getLblPIDFieldErrorMsg().getText();
    }

    public String getRegisterErrorMsg()
    {
        return this.getLblRegisterErrorMsg().getText();
    }

    public String getTicketAmountErrorMsg()
    {
        return this.getLblTicketAmountErrorMsg().getText();
    }

    public String getTicketAmountFieldErroeMsg()
    {
        return this.getLblTicketAmountFieldErrorMsg().getText();
    }

    public void goToTabLogin()
    {
        Constant.WEDBRIVER.findElement(tabLogin).click();
    }

    public void goToTabContact()
    {
        Constant.WEDBRIVER.findElement(tabContact).click();
    }

    public void goToTabBookTicket()
    {
        Constant.WEDBRIVER.findElement(tabBookTicket).click();
    }

    public void goToTabRegister()
    {
        Constant.WEDBRIVER.findElement(tabRegister).click();
    }

    public void goToTabChangePassword()
    {
        Constant.WEDBRIVER.findElement(tabChangePassword).click();
    }

    public void goToTabMyTicket()
    {
        Constant.WEDBRIVER.findElement(tabMyTicket).click();
    }

    public void goToTabTimeTable()
    {
        Constant.WEDBRIVER.findElement(tabTimeTable).click();
    }

    public void goToTabLogout()
    {
        Constant.WEDBRIVER.findElement(tabLogout).click();
    }

    public void goToTabTicketPrice()
    {
        Constant.WEDBRIVER.findElement(tabTickPrice).click();
    }

    public boolean isHomePageDisplayed()
    {
        boolean statusHP = getTabLoginPage().isDisplayed();
        return statusHP;
    }

    public boolean isLogoutPageDisplayed()
    {
        try
        {
            boolean statusLO = getTabLogout().isDisplayed();
            return statusLO;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

    public boolean isTimeTablePageDisplayed()
    {
        try
        {
            boolean statusTT = getTabTimeTable().isDisplayed();
            return statusTT;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

    public boolean isTicketPricePageDisplayed()
    {
        try
        {
            boolean statusTP = getTabTicketPrice().isDisplayed();
            return statusTP;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

    public boolean isBookTicketPageDisplayed()
    {
        boolean statusBT = getTabBookTicket().isDisplayed();
        return statusBT;
    }

    public void Scroll()
    {
        JavascriptExecutor jse = (JavascriptExecutor) Constant.WEDBRIVER;
        jse.executeScript("window.scrollBy(0,500)");
    }

    public void Scroll1()
    {
        JavascriptExecutor jse = (JavascriptExecutor) Constant.WEDBRIVER;
        jse.executeScript("window.scrollBy(500,0)");
    }
}
