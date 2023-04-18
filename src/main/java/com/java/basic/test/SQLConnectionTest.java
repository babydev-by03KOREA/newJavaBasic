package com.java.basic.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectionTest {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/capstone",
                        "root",
                        "database");
            System.out.println(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
