package com.wuzupkev.p2pchatapp.config;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    private final String dbUrl;
    private final String dbUser;
    private final String dbPassword;

    public DbConnection() {
        Properties props = new Properties();

        try (InputStream input =
                     getClass().getClassLoader().getResourceAsStream("db.properties")) {

            props.load(input);

            dbUrl = props.getProperty("db.url");
            dbUser = props.getProperty("db.user");
            dbPassword = props.getProperty("db.password");

        } catch (Exception e) {
            throw new RuntimeException("Database configuration not found", e);
        }
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (SQLException e) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
