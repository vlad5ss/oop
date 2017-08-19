package com.uladzislau.tylkovich.oop.lessons1;

/**
 * Created by mac on 8/5/17.
 */

public class Earth {
    public static void main(String[] args) {
//        Human tom = new Human();
//        tom.age =5;
//        tom.eyecolor ="brown";
//        tom.name = "Tom zasabo";
//        tom.hieghinchies = 72;
//        tom.speak();
//
//        Human joe = new Human();
//
//        joe.age =10;
//        joe.eyecolor ="brown1";
//        joe.name = "Tom zasao";
//        joe.hieghinchies = 74;
//        joe.speak();

        Human human1 = new Human("Tom",25,76,"Blue");
        Human human2 = new Human("Vlad",22,188,"Green");
        Human human3 = new Human("Olga",22,176,"Green");
        human1.speak();
        human2.speak();
        human3.speak();


    }

}
