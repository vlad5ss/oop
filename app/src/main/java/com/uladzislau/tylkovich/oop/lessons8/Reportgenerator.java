package com.uladzislau.tylkovich.oop.lessons8;

/**
 * Created by mac on 8/6/17.
 */

public class Reportgenerator {

    private Reporting transactionObject;

    public void generateReport(){
        System.out.println(transactionObject.getName()+" " + transactionObject.productBreakDown()+" "+transactionObject.getDate());
    }
}
