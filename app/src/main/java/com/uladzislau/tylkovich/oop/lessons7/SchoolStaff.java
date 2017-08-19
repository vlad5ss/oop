package com.uladzislau.tylkovich.oop.lessons7;

/**
 * Created by mac on 8/6/17.
 */

public class SchoolStaff {
    private void makeAnnouncements(){
        System.out.println("made announcements...");
    }

    private void takeAttendence(){
        System.out.println("took attendence...");
    }

    private void collectPaperWork(){
        System.out.println("collect paperwork...");
    }

    private void conductHallwayDuties(){
        System.out.println("conduct hall wa duties...");
    }

    private void performOtherResponsibilities(){
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conductHallwayDuties();
        performOtherResponsibilities();
    }
}
