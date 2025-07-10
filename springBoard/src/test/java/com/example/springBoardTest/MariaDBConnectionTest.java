package com.example.springBoardTest;

import org.junit.Test;
import org.mariadb.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConnectionTest {
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://localhost:3306";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    @Test
    public void testConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER);
        try(Connection conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
