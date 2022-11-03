package entities;

public class Payment {

    String nameOfMerchant;
    String date;
    double amountOfPayment;

    public Payment() {
    }

    public String getNameOfMerchant() {
        return nameOfMerchant;
    }

    public void setNameOfMerchant(String nameOfMerchant) {
        this.nameOfMerchant = nameOfMerchant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmountOfPayment() {
        return amountOfPayment;
    }

    public void setAmountOfPayment(double amountOfPayment) {
        this.amountOfPayment = amountOfPayment;
    }



}
