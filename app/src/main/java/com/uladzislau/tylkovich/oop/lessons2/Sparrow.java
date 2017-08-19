package com.uladzislau.tylkovich.oop.lessons2;

/**
 * Created by mac on 8/6/17.
 */

public class Sparrow extends Bird implements Flyable {

    public Sparrow(int age, String gender, int weighLbs) {
        super(age, gender, weighLbs);
    }


    public void fly() {
        System.out.println("Sparrow flying hiegh");
    }

}
