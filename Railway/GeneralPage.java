package Railway;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {

    //Locators
    private final By tabLogin = By.xpath("//a[@href = '/Account/Login.cshtml']");
    private final By tabBookTicket = By.xpath("//a[@href='/Page/BookTicketPage.cshtml']");
    private final By tabRegister = By.xpath("//a[@href = '/Account/Register.cshtml']");
    private final By tabChangePassword = By.xpath("//a[@href = '/Account/ChangePassword.cshtml']");
    private final By tabMyTicket = By.xpath("//a[@href ='/Page/ManageTicket.cshtml']");
    private final By lblWelcomeMsg = By.xpath("//div[@class='account']/strong");
    private final By lblLoginErrorMsg = By.xpath("//p[@class='message error LoginForm' and text()]");
    private final By lblRegisterSuccessMsg = By.xpath("//div[@id='content' ]/p[text()]");
    private final By lblChangePassSuccessMsg = By.xpath("//form[@method='post']//p[@class='message success' and text()]");
    private final By lblChangePassFailMsg = By.xpath("//p[@class='message error' and text()]");
    private final By lblPasswordFieldErrorMsg = By.xpath("//label[@for='password' and @class='validation-error']");
    private final By lblPIDFieldErrorMsg = By.xpath("//label[@for='pid' and @class='validation-error' and text()]");

    //Elements
    protected WebElement getLblWelcomeMsg()
    {
        return Constant.WEDBRIVER.findElement(lblWelcomeMsg);
    }

    public WebElement getTabBookTicket()
    {
        return Constant.WEDBRIVER.findElement(tabBookTicket);
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

    public WebElement getLblPIDFieldErrorMsg()
    {
        return Constant.WEDBRIVER.findElement(lblPIDFieldErrorMsg);
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

    public String getPIDFieldErrorMsg()
    {
        return this.getLblPIDFieldErrorMsg().getText();
    }

    public void goToTabLogin()
    {
        Constant.WEDBRIVER.findElement(tabLogin).click();
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

}
