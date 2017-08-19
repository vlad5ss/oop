package com.uladzislau.tylkovich.oop.lessons9;

/**
 * Created by mac on 8/6/17.
 */

public class Largeengine implements Engine1 {

    private int horsePower;

    public Largeengine(int horsePower){
        this.horsePower=horsePower;
    }


    @Override
    public void startengine() {
        System.out.println("start large"+ horsePower + "hp engine");
    }
}
