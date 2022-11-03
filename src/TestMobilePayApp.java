
import mobileApp.MobileAppFacade;
import java.text.ParseException;


public class TestMobilePayApp {
    public static void main(String[] args) throws ParseException {

        MobileAppFacade mobileApp = new MobileAppFacade();

        mobileApp.insertingData("2018-09-01", "7-ELEVEN",50,0.15);
        mobileApp.insertingData("2018-09-04","CIRCLE_K",50,0.2);
        mobileApp.insertingData("2018-09-03","Telia",9,0.1);
    }
}
