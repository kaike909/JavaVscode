package Fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        // (F - 32) x 5/9 = C
        Scanner in = new Scanner(System.in);
        final int a = 32;
        final double b = 5 / 9.0;
        System.out.print("Digite a temperatura em Fahrenheit = ");
        int f = in.nextInt();
        double c = (f - a) * b;
        System.out.printf("A conversao de %dF, para C fica = %.1fC", f, c);
        in.close();
    }
}
