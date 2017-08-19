package com.uladzislau.tylkovich.oop.lessons10;

import com.uladzislau.tylkovich.oop.lessons4.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 8/6/17.
 */

public class EmployeeManager1 implements ISubject {

    private List<IObserver> observers;
    private List<Employee2> employee2s;

    private EmployeeDAO1 employeeDAO1;
    private String msg;
    private Employee2 employee2;

    public EmployeeManager1(){
        observers = new ArrayList<IObserver>();
        employeeDAO1 = new EmployeeDAO1();
        employee2s = employeeDAO1.generateEmployees();
    }



    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver departments : observers) {
            departments.callMe();

        }
    }

    public void hireNewEmployee(Employee2 emp) {
        employee2 = emp;
        msg = "New hire";
        employee2s.add(emp);
        notifyObservers();
    }


    public void modifyEmployeeName(int id, String newName) {
//        if(id == employee2.employeId){
//            employee2.setName();
//            this.employee2 = emp;
//            this.employee2 = emp;
//            this.msg = "Employee name has been notified";
//            notify = true;
//        }
//
//    }
//if (notify)
//    notifyObservers();
    }
}
