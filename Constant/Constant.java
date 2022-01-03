package Constant;

import org.openqa.selenium.WebDriver;
import java.util.Calendar;

public class Constant {

        public static WebDriver WEDBRIVER;
        public static final String RAILWAY_URL = "http://www.railway.somee.com";

        //TC01
        public static final String USERNAME1 = "an4@gmail.com";
        public static final String PASSWORD1 = "admin1234567";

        //TC02
        public static final String USERNAME2 = "";
        public static final String PASSWORD2 = "admin123456";

        //TC03
        public static final String USERNAME3 = "an4@gmail.com";
        public static final String PASSWORD3 = "admin";


        //TC07
        public static final Calendar calendar = Calendar.getInstance();
        public static final String EMAIL = calendar.get(Calendar.SECOND) + "@gmail.com";
        public static final String PASSWORD = "admin123456";
        public static final String CONFIRMPASSWORD = "admin123456";
        public static final String PID = "123456789";

        //TC09
        public static final String CURRENTPASSWORD_TC09 = "admin123456";
        public static final String NEWPASSWORD_TC09 = "a123:\"/{}!@$\\";
        public static final String CONFIRMPASSWORD_TC09 = "b456:\"/{}!@$\\";

        //TC10
        public static final String EMAIL_TC10 = "an4@gmail.com";
        public static final String PASSWORD_TC10 = "admin123456";
        public static final String CONFIRMPASSWORD_TC10 = "admin123456";
        public static final String PID_T10 = "123456789";

        //TC11
        public static final String EMAIL_TC11 = "an30@gmail.com";
        public static final String PASSWORD_TC11 = "";
        public static final String CONFIRMPASSWORD_TC11 = "";
        public static final String PID_TC11 = "";
}
