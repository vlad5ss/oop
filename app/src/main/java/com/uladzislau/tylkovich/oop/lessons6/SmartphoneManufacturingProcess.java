package com.uladzislau.tylkovich.oop.lessons6;

/**
 * Created by mac on 8/6/17.
 */

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void asseblyDevice() {
        System.out.println("assembly smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested smartphone");

    }

    @Override
    protected void pacageDevice() {
        System.out.println("package smartphone");

    }

    @Override
    protected void storeDevice() {

    }
}
