package entities;

public class Transaction {
    String date;
    String nameOfMerchant;
    double amount;

    public Transaction() {
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNameOfMerchant() {
        return nameOfMerchant;
    }

    public void setNameOfMerchant(String nameOfMerchant) {
        this.nameOfMerchant = nameOfMerchant;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
