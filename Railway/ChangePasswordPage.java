package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends GeneralPage{

    private final By txtCurrentPassword = By.id("currentPassword");
    private final By txtNewPassword = By.id("newPassword");
    private final By txtConfirmPassword = By.id("confirmPassword");
    private final By btnChangePassword = By.xpath("//input[@type='submit']");

    public WebElement getTxtConfirmPassword() {
        return Constant.WEDBRIVER.findElement(txtConfirmPassword);
    }

    public WebElement getTxtCurrentPassword() {
        return Constant.WEDBRIVER.findElement(txtCurrentPassword);
    }

    public WebElement getTxtNewPassword()
    {
        return Constant.WEDBRIVER.findElement(txtNewPassword);
    }

    public WebElement getBtnChangePassword()
    {
        return Constant.WEDBRIVER.findElement(btnChangePassword);
    }

    public void ChangePassword(String currentPassword, String newPassword, String confirmPassword)
    {
        this.getTxtCurrentPassword().sendKeys(currentPassword);
        this.getTxtNewPassword().sendKeys(newPassword);
        this.getTxtConfirmPassword().sendKeys(confirmPassword);
        this.getBtnChangePassword().click();
    }
}
