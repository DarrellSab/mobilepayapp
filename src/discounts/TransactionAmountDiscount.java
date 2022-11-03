package discounts;

public class TransactionAmountDiscount implements  ITransactionAmountDiscount {

    private double discountAmount;
    @Override
    public double calculateTransactionAmountDiscount(Double merchantDiscount, double transactionAmountDiscount, int transactionAmount, int fitAmount){
        if(transactionAmount >fitAmount){
            return merchantDiscount - (merchantDiscount*transactionAmountDiscount) ;
        }

        return merchantDiscount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
}
