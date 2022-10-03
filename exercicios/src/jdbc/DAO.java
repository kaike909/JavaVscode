package jdbc;

import java.sql.*;

public class DAO {

    private Connection conexao;

    public int incluir(String sql, Object... atributos) {
        try {
            PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(stmt, atributos);

            if (stmt.executeUpdate() > 0) {
                ResultSet resultado = stmt.getGeneratedKeys();
                if (resultado.next()) {
                    return resultado.getInt(1);
                }
            }
            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
        int indice = 1;
        for (Object atributo : atributos) {
            if (atributo instanceof String) {
                stmt.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer) {
                stmt.setInt(indice, (Integer) atributo);
            } else if (atributo instanceof Double) {
                stmt.setDouble(indice, (double) atributo);
            } else if (atributo instanceof Boolean) {
                stmt.setBoolean(indice, (Boolean) atributo);
            }
            indice++;
        }
    }

    public void close() {
        try {
            getConexao().close();
        } catch (SQLException e) {

        } finally {
            conexao = null;
        }
    }

    private Connection getConexao() {

        conexao = FabricaConexao.getConexao();

        try {
            if (conexao != null & !conexao.isClosed()) {
                return conexao;
            }
        } catch (SQLException e) {

        }

        return conexao;

    }
}
