package jdbc;

import java.sql.*;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "897410";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexao efetuada com sucesso!");

        conexao.close();

    }
}