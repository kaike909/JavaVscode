package Fundamentos.Desafios;

import java.util.Scanner;

public class DesafioArea {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o valor da base: ");
        double b = in.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double h = in.nextDouble();

        double A = b * h / 2;

        System.out.printf("O valor da Area é igual a %.2f", A);

        in.close();

    }   
}
