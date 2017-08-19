package com.uladzislau.tylkovich.oop.lessons1;

/**
 * Created by mac on 8/5/17.
 */

public class Human {


    String name;
    int age;
    int hieghinchies;
    String eyecolor;

    public Human(String name, int age, int hieghinchies, String eyecolor) {
        this.name = name;
        this.age = age;
        this.hieghinchies = hieghinchies;
        this.eyecolor = eyecolor;
    }

    public Human() {

    }
//    public Human() {
//        age = 5;
//        eyecolor = "brown";
//        hieghinchies = 72;
//        name = "tom zasabo";
//
//    }

    public void speak() {
        System.out.println("Hello ,my name is " + name);
        System.out.println("I am " + hieghinchies + "tall");
        System.out.println("I am" + age + " years old");
        System.out.println("My eye color is " + eyecolor);
    }

    public void eat() {
        System.out.println("eating");
    }

    public void work() {
        System.out.println("working...");
    }
}
