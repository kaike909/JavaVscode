package Streams;

import java.util.*;
import java.util.function.*;;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 7.2);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> getAprove = a -> a.nota >= 7;
        Predicate<Aluno> getDesaprove = getAprove.negate();

        System.out.println(alunos.stream().allMatch(getAprove));
        System.out.println(alunos.stream().anyMatch(getAprove));
        System.out.println(alunos.stream().noneMatch(getDesaprove));

    }
}
