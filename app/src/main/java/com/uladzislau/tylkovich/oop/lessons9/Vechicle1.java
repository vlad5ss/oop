package com.uladzislau.tylkovich.oop.lessons9;

/**
 * Created by mac on 8/6/17.
 */

public class Vechicle1 {

   Engine1 myEngine1;
//    Tire tire;
//    WindShield shield;
//    Roof roof;




    public Vechicle1(Engine1 anEngine){
        myEngine1 = anEngine;
    }

    public void crankIgnition(){
//        racingEngine.startengine();
        myEngine1.startengine();
        System.out.println("Vechicle is running");
    }
}
