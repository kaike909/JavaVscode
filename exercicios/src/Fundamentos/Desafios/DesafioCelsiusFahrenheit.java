package Fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCelsiusFahrenheit {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a conversao desejada: (C ou F) ");
        char con = in.next().charAt(0);

        if (con == 'c'){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double f = in.nextDouble();
            double conc = (f - 32) * (5.0/9);
            System.out.printf("A temperatura %.1f F para Celsius é %.1f C", f, conc);
        }
        else if(con == 'f'){
            System.out.print("Digite a temperatura em Celsius: ");
            double c = in.nextDouble();
            double conf = (c * 9 / 5) + 32;
            System.out.printf("A temperatura %.1f C para Fahrenheit é %.1f F", c, conf);
        }
        
        in.close();

    }
}
