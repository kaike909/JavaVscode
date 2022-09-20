package kaike.Banco;

import java.io.*;
import java.sql.*;
import java.util.*;

public class MakeConnection {

    public static Connection getConnection() {

        try {
            Properties prop = getProperties();
            final String url = prop.getProperty("banco.url");
            final String user = prop.getProperty("banco.user");
            final String password = prop.getProperty("banco.password");
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
}
