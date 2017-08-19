package com.uladzislau.tylkovich.oop.lessons4;

/**
 * Created by mac on 8/6/17.
 */

public class EmployeeDAO {
    public void saveEmploye(Employee employee){

//        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstace();
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("Insert into Employee");
//        connectionManager.disconnect();
        System.out.println("saved Employee to datdbase: " + employee);

    }

    public void deleteEmployee(Employee employee){
        System.out.println("saved Employee to datdbase: " + employee);

    }
}
