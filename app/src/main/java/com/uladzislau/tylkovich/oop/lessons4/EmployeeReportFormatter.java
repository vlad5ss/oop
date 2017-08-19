package com.uladzislau.tylkovich.oop.lessons4;

/**
 * Created by mac on 8/6/17.
 */

public class EmployeeReportFormatter extends ReportFormatter {


    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee(){

        return getFormattedValue();
    }



}
