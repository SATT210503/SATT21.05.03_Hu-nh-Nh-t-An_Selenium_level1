package Railway;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends GeneralPage {

    private final By txtUsername = By.id("username");
    private final By txtPassword = By.id("password");
    private final By txtEmail = By.id("email");
    private final By txtConfirmPassword = By.id("confirmPassword");
    private final By txtPassportNumber = By.id("pid");
    private final By txtCurrentPassword = By.id("currentPassword");
    private final By txtNewPassword = By.id("newPassword");
    private final By btnLogin = By.xpath("//input[@type='submit']");
    private final By btnRegister = By.xpath("//input[@type='submit']");
    private final By btnBookTicket = By.xpath("//input[@type='submit']");
    private final By btnCancel = By.xpath("//tr[@class='EvenRow']//input[@onclick='DeleteTicket(4512);']");
    private final By lstDepart = By.name("DepartStation");
    private final By lstArrive = By.name("ArriveStation");
    private final By lstSeatType = By.name("SeatType");
    private final By lstDate = By.name("Date");

    public WebElement getTxtUsername() {
        return Constant.WEDBRIVER.findElement(txtUsername);
    }

    public WebElement getTxtPassword() {
        return Constant.WEDBRIVER.findElement(txtPassword);
    }

    public WebElement getBtnLogin() {
        return Constant.WEDBRIVER.findElement(btnLogin);
    }

    public WebElement getBtnRegister() {
        return Constant.WEDBRIVER.findElement(btnRegister);
    }

    public WebElement getTxtEmail() {
        return Constant.WEDBRIVER.findElement(txtEmail);
    }

    public WebElement getTxtConfirmPassword() {
        return Constant.WEDBRIVER.findElement(txtConfirmPassword);
    }

    public WebElement getTxtPassportNumber() {
        return Constant.WEDBRIVER.findElement(txtPassportNumber);
    }

    public WebElement getTxtCurrentPassword() {
        return Constant.WEDBRIVER.findElement(txtCurrentPassword);
    }

    public WebElement getTxtNewPassword() {
        return Constant.WEDBRIVER.findElement(txtNewPassword);
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

    public WebElement getBtnBookTicket() {
        return Constant.WEDBRIVER.findElement(btnBookTicket);
    }
    public WebElement getBtnCancel() {
        return Constant.WEDBRIVER.findElement(btnCancel);
    }

    //Method

    public void selectDate(String Date) {
        Select dt = new Select(this.getLstDate());
        dt.selectByVisibleText(Date);
    }

    public void SelectDepart(String depart) {
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
        Select stations = new Select(this.getLstSeatType());
        stations.selectByVisibleText(type);
        //stations.selectByIndex(3);
    }

    public void BookTickt() {
        this.Scroll();
        this.selectDate("1/6/2022");
        this.SelectDepart("Quảng Ngãi");
        this.selectArrive("Huế");
        this.selectSeatType("Soft seat with air conditioner");
        this.getBtnBookTicket().click();
    }

    public void Cancel()
    {
        this.getBtnCancel().click();

    }

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

    public void ClickBtnRegister()
    {
        this.Scroll();
        WebElement element = Constant.WEDBRIVER.findElement(btnRegister);
        Actions actions = new Actions(Constant.WEDBRIVER);
        actions.moveToElement(element).click().build().perform();
    }

    public void Register(String email, String password, String confirmpassword, String PID)
    {
        this.getTxtEmail().sendKeys(email);
        this.getTxtPassword().sendKeys(password);
        this.getTxtConfirmPassword().sendKeys(confirmpassword);
        this.getTxtPassportNumber().sendKeys(PID);
        this.ClickBtnRegister();
    }

    public void ChangePassword(String currentPassword, String newPassword, String confirmPassword)
    {
        this.getTxtCurrentPassword().sendKeys(currentPassword);
        this.getTxtNewPassword().sendKeys(newPassword);
        this.getTxtConfirmPassword().sendKeys(confirmPassword);
        this.getBtnRegister().click();
    }

}
