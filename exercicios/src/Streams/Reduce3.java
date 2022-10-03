package Streams;

import java.util.*;
import java.util.function.*;

public class Reduce3 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> getAprove = a -> a.nota >= 7;
        Function<Aluno, Double> getNota = a -> a.nota;
        BiFunction<Media, Double, Media> getTtl = (media, nota) -> media.getAdd(nota);
        BinaryOperator<Media> comboGet = (m1, m2) -> Media.combo(m1, m2);

        Media media = alunos.stream()
                .filter(getAprove)
                .map(getNota)
                .reduce(new Media(), getTtl, comboGet);

        System.out.printf("Media dos aprovados: %.2f", media.getValor());

    }
}
