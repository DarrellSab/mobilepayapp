package discounts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDiscount implements  IDateDiscount {
    private double discountAmount;
    private Date date;


    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public Date convertDate(String date) throws ParseException {
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        return date1;
    }

    @Override
    public boolean isWeekand(Date d) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        int day = cal.get(Calendar.DAY_OF_WEEK);
        if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public double calculateDiscount(Date date, double transactionAmount) {
        double result = 0;

        if(isWeekand(date)){

            result = transactionAmount * 0.00;

        }
        if (!isWeekand(date)){
            result = transactionAmount* 0.01;
        }
        return result;
    }


}
