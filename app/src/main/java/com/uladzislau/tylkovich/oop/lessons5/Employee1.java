package com.uladzislau.tylkovich.oop.lessons5;

/**
 * Created by mac on 8/6/17.
 */

public abstract class Employee1 {
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee1(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    public abstract void performDuties();

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
