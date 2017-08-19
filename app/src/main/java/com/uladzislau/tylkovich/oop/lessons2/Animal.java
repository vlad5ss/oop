package com.uladzislau.tylkovich.oop.lessons2;

/**
 * Created by mac on 8/6/17.
 */

public abstract class Animal {

    int age;
    String gender;
    int weighLbs;

    public Animal(int age, String gender, int weighLbs) {
        this.age = age;
        this.gender = gender;
        this.weighLbs = weighLbs;
    }

    public  void eat(){
        System.out.println("Eating..");

    }

    public void sleep(){

        System.out.println("Sleeping...");
    }
    public abstract void move();

}
