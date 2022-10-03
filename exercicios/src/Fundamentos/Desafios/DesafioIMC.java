package Fundamentos.Desafios;

import java.util.Scanner;
import java.util.Locale;

public class DesafioIMC {
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en", "US"));
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = in.nextDouble();
        System.out.print("Digite o seu peso: ");
        double peso = in.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        String classificacao;

        if (imc >= 18.5 && imc < 25){
            classificacao = "Normal";
        }
        else if (imc >=25 && imc < 30){
            classificacao = "Sobrepeso";
        }
        else if (imc >= 30 && imc < 40){
            classificacao = "Obesidade";
        }
        else {
            classificacao = "Obesidade Grave";
        }

        System.out.printf("O seu IMC esta em %.1f sua Classificação esta %s", imc, classificacao);

        in.close();

    }
}
