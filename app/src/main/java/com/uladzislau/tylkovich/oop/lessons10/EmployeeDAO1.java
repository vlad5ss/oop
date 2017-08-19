package com.uladzislau.tylkovich.oop.lessons10;

import java.util.List;

/**
 * Created by mac on 8/6/17.
 */

public class EmployeeDAO1 {

    Employee2 emp1 = new Employee2("Mike", null, 500, false);
    Employee2 emp2 = new Employee2("Jane", null, 500, false);
    Employee2 emp3 = new Employee2("Molga", null, 500, false);
    Employee2 emp4 = new Employee2("vlad", null, 500, false);
    Employee2 emp5 = new Employee2("suzan", null, 500, false);

    List<Employee2> employee2s;

    public List<Employee2> generateEmployees(){
        employee2s.add(emp1);
        employee2s.add(emp2);
        employee2s.add(emp3);
        employee2s.add(emp4);
        employee2s.add(emp5);
        return employee2s;
    }

    public void addEmployee(Employee2 emp){
        employee2s.add(emp);
    }


}
