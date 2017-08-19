package com.uladzislau.tylkovich.oop.lessons5;

/**
 * Created by mac on 8/6/17.
 */

public class Doctor extends Employee1 {

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
            diagnosePatient();
    }

    //    //Doctor
    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }


    private void diagnosePatient(){
        System.out.println("Diagnose patient");
    }

}
