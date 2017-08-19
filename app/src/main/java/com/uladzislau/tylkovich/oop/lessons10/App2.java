package com.uladzislau.tylkovich.oop.lessons10;

import java.util.Date;

/**
 * Created by mac on 8/6/17.
 */

public class App2 {
    public static void main(String[] args) {
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment1();

        EmployeeManager1 ems = new EmployeeManager1();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);
        Employee2 bob = new Employee2("Bob",new Date(), 3500,true);
        ems.hireNewEmployee(bob);



//        ems.modifyEmployeeName(5,"Imtiaz");
//        ems.modifyEmployeeName(2,"Imtiaz");

    }



}
