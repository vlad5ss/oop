package com.uladzislau.tylkovich.oop.lessons10;

import java.util.Date;

/**
 * Created by mac on 8/6/17.
 */

public class Employee2 {
    private String name;
    private Date hireDatel;
    private int salary;
    public int employeId;
    private boolean fired = false;
    private boolean working = false;
    private static int COUNTER;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDatel() {
        return hireDatel;
    }

    public void setHireDatel(Date hireDatel) {
        this.hireDatel = hireDatel;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", hireDatel=" + hireDatel +
                ", salary=" + salary +
                ", employeId=" + employeId +
                ", fired=" + fired +
                ", working=" + working +
                '}';
    }

    public Employee2(String name, Date hireDatel, int salary, boolean working {
        this.name = name;
        this.hireDatel = hireDatel;
        this.salary = salary;
        this.working = working;
        employeId = ++COUNTER;

    }






}

