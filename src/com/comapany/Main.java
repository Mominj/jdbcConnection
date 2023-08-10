package com.comapany;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try {
            Connection conn = new DbConnection().connect_to_db();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from acc");

            while (rs.next()) {

                String name = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                System.out.println( name + "," + email +  "," + password);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
