import Constant.Constant;
import Railway.HomePage;
import Railway.LoginPage;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {


    public void beforeMethod()
    {
        System.out.println("Pre-conditions");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\LogiGear_doc\\Selenium_level1_2\\chromedriver.exe");
        Constant.WEDBRIVER =new ChromeDriver();
        Constant.WEDBRIVER.manage().window().maximize();
    }
    public void afterMethod()
    {
        System.out.println("Post-conditions");
        Constant.WEDBRIVER.quit();
    }


}
