package kaike.Banco;

import java.io.*;
import java.sql.*;
import java.util.*;

public class MakeConnection {

    public static Connection getConnection() {

        try {
            Properties prop = getProperties();
            final String url = prop.getProperty("Banco.url");
            final String user = prop.getProperty("Banco.user");
            final String password = prop.getProperty("Banco.password");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnectionDatabase() {

        try {
            Properties prop = getPropertiesDatabase();
            final String url = prop.getProperty("Banco.url");
            final String user = prop.getProperty("Banco.user");
            final String password = prop.getProperty("Banco.password");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String path = "connection.properties";
        prop.load(MakeConnection.class.getResourceAsStream(path));
        return prop;
    }

    private static Properties getPropertiesDatabase() throws IOException {
        Properties prop = new Properties();
        String path = "connectionDatabase.properties";
        prop.load(MakeConnection.class.getResourceAsStream(path));
        return prop;
    }
}
