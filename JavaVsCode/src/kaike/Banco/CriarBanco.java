package kaike.Banco;

import java.sql.*;
import java.util.*;

public class CriarBanco {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void criarBanco() throws SQLException {

        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "897410";
        Scanner in = new Scanner(System.in);

        Connection conn = DriverManager.getConnection(url, user, password);

        System.out.print("Digite o nome do Banco de dados: ");
        this.nome = in.nextLine();

        Statement ps = conn.createStatement();
        ps.execute("Create database if not exists " + this.nome + ";");

        System.out.println("Banco de Dados criado com sucesso!");

        conn.close();
        ps.close();
        in.close();
    }

    public void droparBanco() throws SQLException {

        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "897410";
        Scanner in = new Scanner(System.in);

        Connection conn = DriverManager.getConnection(url, user, password);

        System.out.print("Qual banco de dados voce quer dropar? ");
        this.nome = in.nextLine();

        Statement ps = conn.createStatement();
        ps.execute("drop database if exists " + this.nome + ";");

        System.out.println("Banco de Dados deletado com sucesso!");

        conn.close();
        ps.close();
        in.close();
    }

}
