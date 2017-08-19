package com.uladzislau.tylkovich.oop.lessons4;

/**
 * Created by mac on 8/6/17.
 */

public class ReportFormatter {

     String formattedOutput;
    public ReportFormatter(Object object, FormatType formatType){
        switch (formatType){
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
        }
    }

    private String convertObjectToXML(Object object){

        return "XML: <title>" +object.toString() + "</title>";

    }

    private String convertObjectToCSV(Object object){

        return "XML: ..." +object.toString() + "</title>";

    }

    protected String getFormattedValue(){
        return formattedOutput;
    }

}
