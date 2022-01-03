package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyTicketPage extends GeneralPage{

    private final By btnCancel = By.xpath("//tr[@class='EvenRow']//input[@onclick='DeleteTicket(4576);']");

    public WebElement getBtnCancel() {
        return Constant.WEDBRIVER.findElement(btnCancel);
    }

    public void Cancel()
    {
        this.Scroll();
        WebDriverWait wait = new WebDriverWait(Constant.WEDBRIVER, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnCancel));
        this.getBtnCancel().click();
        Constant.WEDBRIVER.switchTo().alert().accept();
    }
}
