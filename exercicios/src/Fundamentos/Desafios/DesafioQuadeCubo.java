package Fundamentos.Desafios;

import java.util.Scanner;

public class DesafioQuadeCubo {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Digite qualquer numero: ");
        int x = in.nextInt();

        int quad = (int) Math.pow(x, 2);
        System.out.printf("%d² = %d\n", x, quad);
        
        int cubo = (int) Math.pow(x, 3);
        System.out.printf("%d³ = %d", x, cubo);

        in.close();

    }
}
