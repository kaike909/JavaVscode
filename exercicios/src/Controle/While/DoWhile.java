package Controle.While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String text = "";

        do {
            System.out.println("Voce precisa falar as palavras magicas... ");
            System.out.print("Quer sair? ");
            text = in.nextLine();
        } while (!text.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");

        in.close();

    }
}
