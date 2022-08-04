package Controle.Desafios;

import java.util.Scanner;

public class DesafioSomaP {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cont = 0;

        System.out.print("Digite um numero: ");
        int x = in.nextInt();

        while (x >= 0) {
            System.out.printf("%d + %d = %d\n", cont, x, cont);
            cont += x;
            System.out.print("Digite outro numero: ");
            x = in.nextInt();
        }

        System.out.printf("A soma de todos os numeros digitados é %d", cont);

        in.close();

    }
}
