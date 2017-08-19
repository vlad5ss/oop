package com.uladzislau.tylkovich.oop.lessons9;

/**
 * Created by mac on 8/6/17.
 */

public class App1 {


    public static void main(String[] args) {
        Vechicle1 racerCar = new Vechicle1(new Smallengine(100));
        racerCar.crankIgnition();
    }

}
