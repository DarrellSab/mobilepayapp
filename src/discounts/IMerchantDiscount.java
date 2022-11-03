package discounts;

import entities.Merchant;
import entities.Transaction;

public interface IMerchantDiscount {
    double calculateMerchantDiscount(Transaction transaction, Merchant discount);
}
