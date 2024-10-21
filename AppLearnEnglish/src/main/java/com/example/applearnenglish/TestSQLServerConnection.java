package com.example.applearnenglish;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestSQLServerConnection {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=DBLearnEnglish;trustServerCertificate=true";
        String username = "sa";
        String password = "sa";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection successful!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
