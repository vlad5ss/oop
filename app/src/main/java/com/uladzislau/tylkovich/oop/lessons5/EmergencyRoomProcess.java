package com.uladzislau.tylkovich.oop.lessons5;

/**
 * Created by mac on 8/6/17.
 */

public class EmergencyRoomProcess {
    public static void main(String[] args) {

        HospitalManager ERDirector = new HospitalManager();
        Employee1 peggy = new Nurse(1,"Peggy", "emergency",true);

        ERDirector.callUpon(peggy);
        Employee1 suzan = new Doctor(2,"Suzan","emerggency",true);
        ERDirector.callUpon(suzan);


    }

}
