package com.example.applearnenglish;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestSQLServerConnection {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3307/DBLearnEnglish";
        String username = "root";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection successful!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
