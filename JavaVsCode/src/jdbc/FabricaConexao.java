package jdbc;

import java.io.*;
import java.sql.*;
import java.util.*;

public class FabricaConexao {

    public static Connection getConexao() {

        try {
            Properties prop = getProperties();
            final String url = prop.getProperty("banco.url");
            final String usuario = prop.getProperty("banco.usuario");
            final String senha = prop.getProperty("banco.senha");

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String path = "conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(path));
        return prop;
    }

}
