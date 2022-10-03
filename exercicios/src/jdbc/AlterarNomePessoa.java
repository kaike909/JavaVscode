package jdbc;

import java.sql.*;
import java.util.*;

public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);
        String resp = "y";
        Connection conexao = FabricaConexao.getConexao();

        while ("y".equalsIgnoreCase(resp)) {

            System.out.print("Informe o codigo da pessoa: ");
            int valor = in.nextInt();
            String selectSQL = "select * from pessoas where codigo = ?";
            String updateSQL = "update pessoas set nome = ? where codigo = ?";

            PreparedStatement stmt = conexao.prepareStatement(selectSQL);
            stmt.setInt(1, valor);
            ResultSet r = stmt.executeQuery();

            if (r.next()) {
                Pessoa p = new Pessoa(r.getInt(1), r.getString(2));

                System.out.println("O nome atual é " + p.getNome());
                in.nextLine();

                System.out.print("Informe o novo nome: ");
                String novoNome = in.nextLine();

                stmt.close();
                stmt = conexao.prepareStatement(updateSQL);
                stmt.setString(1, novoNome);
                stmt.setInt(2, valor);
                stmt.execute();

                System.out.println("Pessoa alterada com sucesso!");
            } else {
                System.out.println("Pessoa não encontrada!");
            }

            System.out.print("Deseja continuar? [Y/N] ");
            resp = in.nextLine();

        }

        conexao.close();
        in.close();

    }
}
