package Fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        // (F - 32) x 5/9 = C
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit = ");
        int f = in.nextInt();
        int b = 32;
        double d = 5/9;
        double c = (f - b) * d;
        System.out.printf("A conversao de %dF, para C fica = %.1fC", f, c);
        in.close();
    }
}
