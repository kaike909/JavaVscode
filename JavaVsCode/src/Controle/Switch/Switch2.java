package Controle.Switch;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String conceito = "";

        System.out.print("Digite a nota do aluno: ");
        int nota = in.nextInt();

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1:
                conceito = "E";
                break;
            case 0:
                conceito = "F";
                break;
            default:
                conceito = "Nao informado!";
        }
        System.out.printf("Conceito é %s", conceito);

        in.close();

    }
}
