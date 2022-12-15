package Controle.Desafios;

import java.util.Scanner;

public class DesafioNotas {
    public static void main(String[] args) {
        /* 3. Criar um programa que receba duas notas parciais, calcular a média
         * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console 
         * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no 
         * console "Recuperação", caso contrário imprime no console "Reprovado".
         */
        Scanner in = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double n1 = in.nextDouble();
        System.out.print("Segunda nota: ");
        double n2 = in.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 7.0 && media <= 10) {
            System.out.printf("MEDIA = %.1f\n", media);
            System.out.println("Aprovado XD");
        } else if(media < 7 && media > 4) {
            System.out.printf("MEDIA = %.1f\n", media);
            System.out.println("Em recuperação");
        } else {
            System.out.printf("MEDIA = %.1f\n", media);
            System.out.println("Reprovado :( ");
        }

        in.close();

    }
    
}
