package com.uladzislau.tylkovich.oop.lessons8;

/**
 * Created by mac on 8/6/17.
 */

public class AccountsReceivable {

    private CustomerTransaction transactionObject;

    public AccountsReceivable(CustomerTransaction aTransaction){
        transactionObject = aTransaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
        //send the invoice
    }
}
