package Streams;

import java.util.*;
import java.util.function.*;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 8.9);
        Aluno a2 = new Aluno("Bia", 9.0);
        Aluno a3 = new Aluno("Carlos", 10.0);
        Aluno a4 = new Aluno("Debora", 6.8);
        Aluno a5 = new Aluno("Edu", 5.3);
        Aluno a6 = new Aluno("Fabi", 9.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> parabens = a -> "Parabens " + a.nome + "! Voce foi aprovado(a)!";

        alunos.stream().filter(aprovado).map(parabens).forEach(System.out::println);

    }
}
