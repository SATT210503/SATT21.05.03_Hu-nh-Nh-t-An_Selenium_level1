package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RegisterPage extends GeneralPage {

    private final By txtEmail = By.id("email");
    private final By txtPassword = By.id("password");
    private final By txtConfirmPassword = By.id("confirmPassword");
    private final By txtPassportNumber = By.id("pid");
    private final By btnRegister = By.xpath("//input[@type='submit']");

    public WebElement getTxtEmail() {
        return Constant.WEDBRIVER.findElement(txtEmail);
    }

    public WebElement getTxtPassword() {
        return Constant.WEDBRIVER.findElement(txtPassword);
    }

    public WebElement getTxtConfirmPassword() {
        return Constant.WEDBRIVER.findElement(txtConfirmPassword);
    }

    public WebElement getTxtPassportNumber() {
        return Constant.WEDBRIVER.findElement(txtPassportNumber);
    }

    public WebElement getBtnRegister() {
        return Constant.WEDBRIVER.findElement(btnRegister);
    }

    public void ClickBtnRegister() {
        this.Scroll();
        WebElement element = Constant.WEDBRIVER.findElement(btnRegister);
        Actions actions = new Actions(Constant.WEDBRIVER);
        actions.moveToElement(element).click().build().perform();
    }

    public void Register(String email, String password, String confirmpassword, String PID) {
        this.getTxtEmail().sendKeys(email);
        this.getTxtPassword().sendKeys(password);
        this.getTxtConfirmPassword().sendKeys(confirmpassword);
        this.getTxtPassportNumber().sendKeys(PID);
        this.ClickBtnRegister();
    }
}
