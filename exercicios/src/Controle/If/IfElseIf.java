package Controle.If;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = in.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota Invalida!");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A!");
            System.out.println("Parabens!");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B!");
            System.out.println("Muito bom!");
        } else if (nota >= 4.1) {
            System.out.println("Conceito C!");
            System.out.println("Precisa melhorar!");
        } else if (nota >= 2.1) {
            System.out.println("Conceito D!");
            System.out.println("Precisa estudar mais!");
        } else {
            System.out.println("Conceito E!");
            System.out.println("Vish!");
        }

        System.out.println("FIM!");
            
        in.close();

    }
}
