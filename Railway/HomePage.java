package Railway;

import Constant.Constant;

public class HomePage extends GeneralPage{

    public HomePage open()
    {
        Constant.WEDBRIVER.get(Constant.RAILWAY_URL);
        return this;
    }
}
