package Controle.Desafios;

import java.util.Scanner;

public class DesafioAnoBissexto {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o ano :");
        int ano = in.nextInt();

        if (ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0)){
            System.out.printf("%d é um ano bissexto", ano);
        } else {
            System.out.printf("%d nao é um ano bissexto", ano);
        }

        in.close();

    }
}
