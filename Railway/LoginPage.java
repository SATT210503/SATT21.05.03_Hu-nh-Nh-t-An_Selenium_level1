package Railway;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends GeneralPage {

    private final By txtUsername = By.id("username");
    private final By txtPassword = By.id("password");
    private final By txtEmail = By.id("email");
    private final By btnLogin = By.xpath("//input[@type='submit']");

    public WebElement getTxtUsername() {
        return Constant.WEDBRIVER.findElement(txtUsername);
    }

    public WebElement getTxtPassword() {
        return Constant.WEDBRIVER.findElement(txtPassword);
    }

    public WebElement getBtnLogin() {
        return Constant.WEDBRIVER.findElement(btnLogin);
    }

    public WebElement getTxtEmail() {
        return Constant.WEDBRIVER.findElement(txtEmail);
    }

    //Method
    public void Login(String username, String password)
    {
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
    }

    public void LoginMultiple(String username, String password, int times)
    {
        for(int i= 1; i<= times; i++)
        {
            this.getTxtUsername().sendKeys(username);
            this.getTxtPassword().sendKeys(password);
            this.getBtnLogin().click();
        }
    }

}
