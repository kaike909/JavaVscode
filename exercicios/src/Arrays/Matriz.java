package Arrays;

import java.util.*;

public class Matriz {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdAluno = in.nextInt();
        System.out.print("Quantas notas por aluno? ");
        int notaAluno = in.nextInt();

        double[][] mediaAlunos = new double[qtdAluno][notaAluno];
        double total = 0;

        for (int i = 0; i < mediaAlunos.length; i++) {
            System.out.printf("Notas do %do aluno\n", i + 1);
            for (int j = 0; j < mediaAlunos[i].length; j++) {
                System.out.printf("Nota %d: ", j + 1);
                mediaAlunos[i][j] = in.nextDouble();
                total += mediaAlunos[i][j];
            }
            System.out.println();
        }
        
        total = total / (qtdAluno * notaAluno);
        System.out.printf("A media total é de %.1f\n", total);

        for (double[] notasAluno : mediaAlunos) {
            System.out.println(Arrays.toString(notasAluno));
        }


        in.close();

    }
}
