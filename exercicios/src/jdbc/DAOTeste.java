package jdbc;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.incluir(sql, "Joao da Silva"));
        System.out.println(dao.incluir(sql, "Vitoria Pereira"));
        System.out.println(dao.incluir(sql, "Ana Julia"));
    }
}
