package TestCase;

import Constant.Constant;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;


public class TestBase {

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Pre-conditions");
        System.setProperty("webdriver.chrome.driver","TestCase/chromedriver.exe");
        Constant.WEDBRIVER = new ChromeDriver();
        Constant.WEDBRIVER.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Constant.WEDBRIVER.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        Constant.WEDBRIVER.manage().window().maximize();

    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("Post-conditions");
        //Constant.WEDBRIVER.quit();
    }
}
