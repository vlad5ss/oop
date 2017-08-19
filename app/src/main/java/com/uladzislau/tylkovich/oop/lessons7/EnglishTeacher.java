package com.uladzislau.tylkovich.oop.lessons7;

/**
 * Created by mac on 8/6/17.
 */

public class EnglishTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach(){
        System.out.println("Tough English");
    }

}
