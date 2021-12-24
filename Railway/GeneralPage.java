package Railway;



import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class GeneralPage {

    //Locators
    private final By tabLogin = By.xpath("//a[@href = '/Account/Login.cshtml']");
    private final By lblWelcomeMsg = By.xpath("//div[@class='account']/strong");
    private final By lblLoginErrorMsg = By.xpath("//p[@class='message error LoginForm']");


    //Elements
    protected WebElement getTabLogin()
    {
        return Constant.WEDBRIVER.findElement(tabLogin);
    }
    protected WebElement getLblWelcomeMsg()
    {
        return Constant.WEDBRIVER.findElement(lblWelcomeMsg);
    }
    public WebElement getLblLoginErrorMsg()
    {
        return Constant.WEDBRIVER.findElement(lblLoginErrorMsg);
    }

    //Method
    public String getWelcomeMsg(){
        return this.getLblWelcomeMsg().getText();
    }
    public String getLoginErrorMsg()
    {
        return this.getLblLoginErrorMsg().getText();
    }


    public LoginPage gotoLoginPage()
    {
        this.getTabLogin().click();
        return new LoginPage();
    }
}
