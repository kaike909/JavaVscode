package Fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // Leu num1
        // Leu num2
        // + - * / %

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = in.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = in.nextDouble();
        System.out.print("Qual operacao deseja fazer? (+, -, *, / ou %) ");
        String op = in.next();

        // Logica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        String parOuImpar = num1 % num2 == 1 ? "Impar" : "Par" ;
        
        System.out.printf("%.2f %s %.2f = %.2f\n", num1, op, num2, resultado);
        System.out.println(parOuImpar);

        in.close();

    }
}
