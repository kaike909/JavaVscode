package Controle.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        // Calcular a media de uma turma com qtd indef.
        // tem q ter uma variavel pra contar as medias
        Locale.setDefault(new Locale("en", "US"));
        Scanner in = new Scanner(System.in);

        System.out.print("Digite as notas de uma turma: (-1 para sair)");
        double nota = in.nextDouble();
        double total = 0;
        int conti = 0,
            contv = 0;

        while(nota != -1){
            if (nota <= -2 || nota >10){
                conti++;
                System.out.print("Perdao digite uma nota valida ou -1 pra terminar o programa: ");
                nota = in.nextDouble();
            } else {
                total += nota;
                contv++;
                System.out.print("Digite as notas de uma turma: (-1 para sair)");
                nota = in.nextDouble();
            }
        }

        System.out.printf("Foram digitados %d notas invalidas!\n", conti);
        System.out.printf("Foram digitados %d notas validas!\n", contv);
        System.out.printf("O total das notas digitadas foram: %.2f", total);

        in.close();

    }
}
