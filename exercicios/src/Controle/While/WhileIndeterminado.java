package Controle.While;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.print("Voce diz: ");
            valor = in.nextLine();
        }

        in.close();

    }
}
