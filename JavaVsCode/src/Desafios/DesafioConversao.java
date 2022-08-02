package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en","US"));
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro salario: R$ ");
        String sal1 = in.nextLine().replace(",", ".");
        System.out.print("Digite o segundo salario: R$ ");
        String sal2 = in.nextLine().replace(",", ".");
        System.out.print("Digite o terceiro salario: R$ ");
        String sal3 = in.nextLine().replace(",", ".");

        double soma = Double.parseDouble(sal1) + Double.parseDouble(sal2) + Double.parseDouble(sal3);
        double media = soma / 3.0;

        System.out.printf("\n\nA media salarial do funcionario é de R$ %.2f", media);
        in.close();

    }
}
