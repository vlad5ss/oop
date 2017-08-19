package com.uladzislau.tylkovich.oop.lessons6;

/**
 * Created by mac on 8/6/17.
 */

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {


    public LaptopManufacturingProcess(String name){
        super(name);
    }

    @Override
    protected void asseblyDevice() {
        System.out.println("assembly laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested laptop");
    }

    @Override
    protected void pacageDevice() {
        System.out.println("package laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("store laptop");
    }

}
