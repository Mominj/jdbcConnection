package com.comapany;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public Connection connect_to_db(){
        Connection connection = null;
        try {
            Class dbDriver = Class.forName("org.postgresql.Driver");
            String jdbcURL = "jdbc:postgresql://127.0.0.1:5432/users";
             connection = DriverManager.getConnection(jdbcURL, "postgres", "password");
             if(connection != null) {
                 System.out.println("connection established");
             } else {
                 System.out.println("connection not established");
             }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
