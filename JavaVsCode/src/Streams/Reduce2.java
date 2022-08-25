package Streams;

import java.util.*;
import java.util.function.*;

public class Reduce2 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> getAprove = a -> a.nota >= 7;
        Function<Aluno, Double> getNota = a -> a.nota;
        BinaryOperator<Double> getSoma = (a, b) -> a + b;

        alunos.stream()
                .filter(getAprove)
                .map(getNota)
                .reduce(getSoma)
                .ifPresent(System.out::println);

    }
}
