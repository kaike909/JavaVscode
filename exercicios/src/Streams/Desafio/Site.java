package Streams.Desafio;

import java.util.*;
import java.util.function.*;;

public class Site {
    public static void main(String[] args) {

        Produto p1 = new Produto("Celular", 2499.99, 0.3, 0.0);
        Produto p2 = new Produto("NoteBook", 4899.99, 0.2, 0.0);
        Produto p3 = new Produto("iPad", 1399.99, 0.6, 0.0);
        Produto p4 = new Produto("Caderno Inteligente", 299.99, 0.7, 50.0);
        Produto p5 = new Produto("Lapis", 9.99, 0.0, 12.0);
        Produto p6 = new Produto("Borracha", 0.99, 0.1, 12.0);
        Produto p7 = new Produto("Oculos", 159.99, 0.25, 25.0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> getDescount = p -> p.desc >= 0.1;
        Predicate<Produto> getFree = p -> p.frete == 0;
        Predicate<Produto> getRelevant = p -> p.preco > 800;
        Function<Produto, String> getChamada = c -> "APROVEITE! " + c.nome + " por R$ " + c.preco + " !!!";

        produtos.stream()
                .filter(getDescount)
                .filter(getFree)
                .filter(getRelevant)
                .map(getChamada)
                .forEach(System.out::println);

    }
}
