package discounts;

public interface ITransactionAmountDiscount {
    double calculateTransactionAmountDiscount(Double merchantDiscount, double transactionAmountDiscount, int transactionAmount, int fitAmount);
}
