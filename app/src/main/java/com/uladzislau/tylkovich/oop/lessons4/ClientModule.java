package com.uladzislau.tylkovich.oop.lessons4;

import static com.uladzislau.tylkovich.oop.lessons4.FormatType.CSV;

/**
 * Created by mac on 8/6/17.
 */

public class ClientModule {
    public static void main(String[] args) {

        Employee peggy = new Employee(1,"peggy","acounting",true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy,FormatType.XML);
    }


    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDao =new EmployeeDAO();
        employeeDao.saveEmploye(employee);

    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDao =new EmployeeDAO();
        employeeDao.deleteEmployee(employee);
    }

     public static void printEmployeeReport(Employee employee,FormatType formatType){
         EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee,formatType);
         formatter.getFormattedEmployee();
         System.out.println(formatter.getFormattedEmployee());
     }
}
