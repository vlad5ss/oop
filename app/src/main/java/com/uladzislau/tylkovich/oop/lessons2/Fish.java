package com.uladzislau.tylkovich.oop.lessons2;

/**
 * Created by mac on 8/6/17.
 */

public class Fish extends Animal
{
    public Fish(int age, String gender, int weighLbs) {
        super(age, gender, weighLbs);
    }

    @Override
    public void move() {
        System.out.println("fish is swiming");
    }

    public static void main(String[] args) {
        System.out.println("Swiming");
    }

}
