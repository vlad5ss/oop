package com.uladzislau.tylkovich.oop.lessons4;

/**
 * Created by mac on 8/6/17.
 */

public class Employee {

    private int id;
    private String name;
    private String department;
    private boolean working;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }

    public Employee(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }
}
