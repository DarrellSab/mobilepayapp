package entities;

public class Merchant {
    String name;
    double discountOfMerchant;
    int idMerchant;

    public Merchant() {
    }


    public double getDiscountOfMerchant() {
        return discountOfMerchant;
    }

    public void setDiscountOfMerchant(double discountOfMerchant) {
        this.discountOfMerchant = discountOfMerchant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
