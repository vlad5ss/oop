package com.uladzislau.tylkovich.oop.lessons9;

/**
 * Created by mac on 8/6/17.
 */

public class Smallengine implements Engine1 {
    private int horsePower;

    public Smallengine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startengine() {
        System.out.println("start small"+ horsePower +" hp engine");
    }
}
