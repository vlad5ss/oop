package com.uladzislau.tylkovich.oop.lessons2;

/**
 * Created by mac on 8/6/17.
 */

public class Bird extends Animal {


    public Bird(int age, String gender, int weighLbs) {
        super(age, gender, weighLbs);
    }

    @Override
    public void move() {
        System.out.println("flyping wings...");
    }

    public  void fly(){
        System.out.println("Flying.....");
    }


}
