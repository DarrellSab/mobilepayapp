package discounts;

import java.text.ParseException;
import java.util.Date;

public interface IDateDiscount {
    Date convertDate(String date) throws ParseException;
    boolean isWeekand(Date d);
    public double calculateDiscount(Date date, double transactionAmount);
}
