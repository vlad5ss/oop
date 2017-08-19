package com.uladzislau.tylkovich.oop.lessons4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by mac on 8/6/17.
 */

public class DatabaseConnectionManager {
    private Connection conn;


    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager(){}

    public static DatabaseConnectionManager getManagerInstace(){

        return connectionInstance;
    }

    public void connect() throws SQLException{
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Establish database connection");

    }

    public Connection getConnectionObject(){
        return conn;
    }

//    public void disconnect() throws Exception{
//        conn.close();
//    }
}
