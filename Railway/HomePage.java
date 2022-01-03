package Railway;
import Constant.Constant;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage extends GeneralPage{

    public void open()
    {
        Constant.WEDBRIVER.get(Constant.RAILWAY_URL);
    }

}
