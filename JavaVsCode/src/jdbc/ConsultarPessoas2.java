package jdbc;

import java.sql.*;
import java.util.*;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);

        System.out.print("Quais os parametros de busca? ");
        String valor = in.nextLine();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas where nome like ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + valor + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");

            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        conexao.close();
        in.close();
    }
}
