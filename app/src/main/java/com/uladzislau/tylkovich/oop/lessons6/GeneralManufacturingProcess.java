package com.uladzislau.tylkovich.oop.lessons6;

/**
 * Created by mac on 8/6/17.
 */

public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess(String name){
        processName = name;

    }

    protected  abstract void asseblyDevice();
    protected abstract void testDevice();
    protected abstract void pacageDevice();
    protected abstract void storeDevice();

    //template methods
    public void lauchProcess(){
        if(processName!=null && !processName.isEmpty()){
            asseblyDevice();
            testDevice();
            pacageDevice();
            storeDevice();
        } else {
            System.out.println("no process name was specified");
        }

    }


}
