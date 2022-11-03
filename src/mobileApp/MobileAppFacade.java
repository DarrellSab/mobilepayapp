package mobileApp;

import discounts.*;
import entities.Merchant;
import entities.Payment;
import entities.Transaction;

import java.text.ParseException;
import java.util.Date;

public class MobileAppFacade {


    IMerchantDiscount merchantDiscount = new MerchantDiscount();
    IDateDiscount dateDiscount = new DateDiscount();
    Transaction transaction = new Transaction();
    ITransactionAmountDiscount transactionAmountDiscount1 = new TransactionAmountDiscount();
    Payment payment = new Payment();
    Merchant merchant1 = new Merchant();
    MerchantDiscount merchantDiscount1 = new MerchantDiscount();

    public MobileAppFacade() {

    }

    public void insertingData(String date, String merchant, int transactionAmount, double suitDiscountForMerchant) throws ParseException {

           merchant1.setName(merchant);
           merchant1.setDiscountOfMerchant(suitDiscountForMerchant);



      Date someDate =  dateDiscount.convertDate(date);
      double result = 0;


            /****Thirst discount by Date****/
      result = dateDiscount.calculateDiscount(someDate,transactionAmount);
        transaction.setDate(date);
        transaction.setNameOfMerchant(merchant);
        transaction.setAmount(result);

        /**The Second Discount by Merchant***/
     double temporallyData =   merchantDiscount.calculateMerchantDiscount(transaction,merchant1);

        merchantDiscount1.setNameMerchant(merchant);
        merchantDiscount1.setDiscountAmountOfMerchant(temporallyData);
        merchantDiscount1.setTransactionAmount(transactionAmount);

        /***The Third Discount an Amount Transaction Discount**/


      double transactionAmountTemporally = transactionAmountDiscount1.calculateTransactionAmountDiscount(merchantDiscount1.getDiscountAmountOfMerchant(),
            0.2,merchantDiscount1.getTransactionAmount(),10);

        payment.setNameOfMerchant(merchant);
        payment.setDate(date);
        payment.setAmountOfPayment(transactionAmountTemporally);

        System.out.println( payment.getDate()+ " " + payment.getNameOfMerchant()+ " " + payment.getAmountOfPayment());


    }


}
