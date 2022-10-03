package Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));
        
        notasAlunoA[0] = 7.9;
        System.out.println(Arrays.toString(notasAlunoA));
        notasAlunoA[1] = 8;
        System.out.println(Arrays.toString(notasAlunoA));
        notasAlunoA[2] = 8.9;
        System.out.println(Arrays.toString(notasAlunoA));
        notasAlunoA[3] = 6.9;
        System.out.println(Arrays.toString(notasAlunoA));

        double totalA = 0;
        for (int i = 0;i < notasAlunoA.length;i++) {
            totalA += notasAlunoA[i];
        }
        
        System.out.printf("MEDIA = %.2f\n", totalA / notasAlunoA.length);
        if(totalA >= 7.0){
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }
        
        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
        
        double totalB = 0;
        for (double d : notasAlunoB) {
            System.out.printf("%.1f ", d);
            totalB += d;
        }

        System.out.println();

        System.out.printf("MEDIA = %.2f\n", totalB / notasAlunoB.length);
        if(totalB >= 7.0){
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }

    }
}
