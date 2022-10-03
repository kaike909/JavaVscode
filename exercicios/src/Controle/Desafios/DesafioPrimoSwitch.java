package Controle.Desafios;

import java.util.Scanner;

public class DesafioPrimoSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cont = 0;

        System.out.print("Digite um numero e descubra se ele é primo: ");
        int x = in.nextInt();

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                cont++;
            }
        }

        switch (cont) {
            case 0:
                System.out.printf("%d É primo", x);
                break;
            default:
            System.out.printf("%d Não é primo", x);
        }

        in.close();

    }
}
