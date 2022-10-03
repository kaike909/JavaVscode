package Fundamentos;

import java.util.Random;
import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print("dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        int z = random.nextInt(100);
        double sal = random.nextDouble(1000000);
        System.out.printf("Megasena: %d %d %d %d %d %d!!\n\n", a, b, c, x, y, z);
        System.out.printf("O salario que vou receber vai ser de R$ %.2f\n\n", sal);
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = in.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = in.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = in.nextInt();
        System.out.printf("\n\n%s %s tem %d anos", nome, sobrenome, idade);
        in.close();
    }
}
