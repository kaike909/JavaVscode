package Controle.Desafios;

import java.util.Scanner;

public class DesafioMaior {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int maior = 0;

        for (int i=0;i<10;i++){

            System.out.print("Digite um numero: ");
            int x = in.nextInt();
            if (i == 0) maior = x;
            if (x > maior){
                maior = x;
            }
        }

        System.out.printf("O maior numero digitado foi %d", maior);

        in.close();

    }
}
