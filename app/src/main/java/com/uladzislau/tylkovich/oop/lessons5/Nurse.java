package com.uladzislau.tylkovich.oop.lessons5;

/**
 * Created by mac on 8/6/17.
 */

public class Nurse extends Employee1 {


    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action....");
    }

    @Override
    public void performDuties() {
            CheckVitalSign();
            drawBlood();
            cleanPatienArea();
    }


    //    Nurses
    private void CheckVitalSign(){
        System.out.println("Checking Vitals");
    }

    private void drawBlood(){
        System.out.println("drawing blood");
    }

    private void cleanPatienArea(){
        System.out.println("Clean patient area");
    }

}
