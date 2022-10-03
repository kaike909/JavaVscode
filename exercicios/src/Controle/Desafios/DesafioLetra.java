package Controle.Desafios;

import java.util.Scanner;

public class DesafioLetra {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma palavra qualquer: ");
        String x = in.next();

        for (int i = 0;i<x.length();i++){
            System.out.printf("%s\n", x.charAt(i));
        }

        in.close();

    }
}
