package com.uladzislau.tylkovich.oop.lessons8;

import java.util.Date;
import java.util.List;

/**
 * Created by mac on 8/6/17.
 */

public class CustomerTransaction implements Accounting, Reporting {
    //methods for reporting


    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(Customer customer,List<Product> products){
        this.products=products;
        this.customer = customer;

    }

    @Override
    public String getName(){
        return customer.getName();
    }

    @Override
    public Date getDate(){
        return new Date();
    }

    @Override
    public String productBreakDown(){
        String reportListing= null;
     for(Product product:products){
        reportListing +=product.getProductName();
     }
     return reportListing;
    }

    @Override
    public void prepareInvoice(){
        System.out.println("invoice prepare...");
    }

    @Override
    public void chargeCustomer(){
        System.out.println("charged the customer");
    }

}
