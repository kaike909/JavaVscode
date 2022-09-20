package kaike.Banco;

import java.sql.*;
import java.util.*;

public class TesteMain {
    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);

        CriarBanco bd = new CriarBanco();

        System.out.print("""
                O que deseja fazer?
                [1] criar banco de dados
                [2] dropar banco de dados
                [3] continuar
                """);
        int esc = in.nextInt();

        switch (esc) {
            case 1:
                bd.criarBanco();
                break;
            case 2:
                bd.droparBanco();
                break;
            case 3:
                break;
        }

        in.close();

    }
}
