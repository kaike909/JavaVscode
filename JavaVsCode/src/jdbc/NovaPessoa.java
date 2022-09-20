package jdbc;

import java.sql.*;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();
        String test = "y";

        while ("y".equalsIgnoreCase(test)) {

            System.out.printf("Informe o nome: ");
            String nome = in.nextLine();

            String sql = "insert into pessoas (nome) values (?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.execute();

            System.out.printf("Pessoa incluida!\n\n");

            System.out.print("Quer adicionar mais pessoas? [y/n] ");
            test = in.nextLine();

        }

        conexao.close();
        in.close();

    }
}
