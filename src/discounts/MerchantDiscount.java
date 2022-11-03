package discounts;

import entities.Merchant;
import entities.Transaction;

public class MerchantDiscount implements IMerchantDiscount {

    private double discountAmountOfMerchant;
    private String nameMerchant;
    private int transactionAmount;

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public MerchantDiscount() {
    }

    public String getNameMerchant() {
        return nameMerchant;
    }

    public void setNameMerchant(String nameMerchant) {
        this.nameMerchant = nameMerchant;
    }


    @Override
    public double calculateMerchantDiscount(Transaction transaction, Merchant discount){
        double discountTemp = transaction.getAmount() * discount.getDiscountOfMerchant();
        return transaction.getAmount() - discountTemp;
    }

    public double getDiscountAmountOfMerchant() {
        return discountAmountOfMerchant;
    }

    public void setDiscountAmountOfMerchant(double discountAmountOfMerchant) {
        this.discountAmountOfMerchant = discountAmountOfMerchant;
    }
}
