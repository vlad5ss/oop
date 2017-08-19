package com.uladzislau.tylkovich.oop.lessons10;

/**
 * Created by mac on 8/6/17.
 */

public class PayrollDepartment implements IObserver {


    @Override
    public void callMe(Employee2 emp, String msg) {
        System.out.println("Payroll Department notified...");
        System.out.println(msg + " "+ emp.getName());
    }
}
