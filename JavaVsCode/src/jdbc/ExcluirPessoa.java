package jdbc;

import java.sql.*;
import java.util.*;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);
        String selectSQL = "select codigo, nome from pessoas";
        String deleteSQL = "delete from pessoas where codigo = ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(selectSQL);
        ResultSet r = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (r.next()) {
            int codigo = r.getInt("codigo");
            String nome = r.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        stmt.close();
        stmt = conexao.prepareStatement(deleteSQL);

        System.out.println("Qual codigo deseja excluir? ");
        int valor = in.nextInt();
        int numCod = 0;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCodigo() == valor) {
                numCod = i;
            }
        }

        int cod = pessoas.get(numCod).getCodigo();

        if (valor == cod) {

            System.out.println("O nome atual é " + pessoas.get(numCod).getNome());
            in.nextLine();

            System.out.println("Pessoa encontrada!");
            System.out.print("Deseja excluir esta pessoa? [Y/N] ");
            String resp = in.nextLine().toLowerCase();
            switch (resp) {
                case "n":
                    break;
                case "y":
                    stmt.setInt(1, valor + 1);
                    if (stmt.executeUpdate() > 0) {
                        System.out.println("Pessoa Excluida com sucesso!");
                    } else {
                        System.out.println("Nada feito!");
                    }
                    break;
            }
        } else {
            System.out.println("Pessoa não encontrada!");
        }

        conexao.close();
        in.close();

    }
}
