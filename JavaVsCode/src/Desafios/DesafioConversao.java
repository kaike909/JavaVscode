package Desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o primeiro salario: R$ ");
        String sal1 = in.nextLine();
        System.out.print("Digite o segundo salario: R$ ");
        String sal2 = in.nextLine();
        System.out.print("Digite o terceiro salario: R$ ");
        String sal3 = in.nextLine();
        double soma = Double.parseDouble(sal1) + Double.parseDouble(sal2) + Double.parseDouble(sal3);
        double media = soma / 3;
        System.out.printf("\n\nA media salarial do funcionario é de R$ %.2f", media);
        in.close();

    }
}
