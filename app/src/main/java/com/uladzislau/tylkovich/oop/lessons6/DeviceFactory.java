package com.uladzislau.tylkovich.oop.lessons6;

/**
 * Created by mac on 8/6/17.
 */

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone process");
        manufacturer.storeDevice();
    }
}
