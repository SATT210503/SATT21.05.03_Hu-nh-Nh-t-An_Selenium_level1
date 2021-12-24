package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage{

    private final By txtUsername = By.xpath("//input[@id='username']");
    private final By txtPassword = By.xpath("//input[@type='password']");
    private final By btnLogin = By.xpath("//input[@type='submit']");



    //Elements
    public WebElement getTxtUsername()
    {
        return Constant.WEDBRIVER.findElement(txtUsername);
    }

    public WebElement getTxtPassword()
    {
        return Constant.WEDBRIVER.findElement(txtPassword);
    }

    public WebElement getBtnLogin()
    {
        return Constant.WEDBRIVER.findElement(btnLogin);
    }



    //Method
    public HomePage Login(String username, String password)
    {
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();

        return new HomePage();
    }
}
