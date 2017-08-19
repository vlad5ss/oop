package com.uladzislau.tylkovich.oop.lessons10;

/**
 * Created by mac on 8/6/17.
 */

public class HRDepartment1 implements IObserver {

    @Override
    public void callMe(Employee2 emp, String msg) {
        System.out.println("HR department notified..");
        System.out.println(msg + " "+ emp.getName());
    }
}
