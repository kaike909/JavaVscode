package kaike.Banco;

import java.sql.*;
import java.util.*;

public class CreateBank {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void criarBanco() throws SQLException {

        Connection conn = MakeConnection.getConnection();

        Scanner in = new Scanner(System.in);

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

        Connection conn = MakeConnection.getConnection();

        Scanner in = new Scanner(System.in);

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
