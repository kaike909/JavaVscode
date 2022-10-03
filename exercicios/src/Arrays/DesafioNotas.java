package Arrays;

import java.util.*;

public class DesafioNotas {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner in = new Scanner(System.in);

        System.out.print("Digite quantas notas voce quer: ");
        int n = in.nextInt();

        double[] notas = new double[n];

        for (int i=0;i<notas.length;i++){
            System.out.printf("Digite a %da nota: ", i+1);
            notas[i] = in.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        total = total / notas.length;
        System.out.println(total);
        if (total >= 7.0) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }

        in.close();

    }
}
