package Controle.Desafios;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinha {
    public static void main(String[] args) {
        /*
         * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
         * um numero aleatório em uma variável. O Jogador tem 10 tentativas para
         * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
         * de tentativas restantes, e imprima se o número inserido é maior ou menor do
         * que o número armazenado.
         * 
         */

        Scanner in = new Scanner(System.in);

        Random ran = new Random();
        int x = ran.nextInt(0, 100);

        System.out.print("Tente adivinhar o numero em que estou pensando... ");
        int a = in.nextInt();

        for (int i = 9; i > 0; i--) {

            if (a == x) {
                System.out.println("Parabens, voce conseguiu me vencer!!");
                break;
            } else if (a < x) {
                System.out.println("Coloque mais...");
                System.out.printf("Tente por mais %d tentativas, acredito em voce... ", i);
                a = in.nextInt();
            } else if (a > x) {
                System.out.println("Coloque menos...");
                System.out.printf("Tente por mais %d tentativas, acredito em voce... ", i);
                a = in.nextInt();
            }
        }

        if (a != x) System.out.println("Puxa que pena, parece que EU venci dessa vez! Boa sorte na proxima!");

        System.out.println("Fim de Jogo!");

        in.close();

    }

}
