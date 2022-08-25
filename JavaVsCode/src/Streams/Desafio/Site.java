package Streams.Desafio;

import java.util.*;
import java.util.function.*;;

public class Site {
    public static void main(String[] args) {

        Produto p1 = new Produto("Lapis", 1.99, 0.35, 0.0);
        Produto p2 = new Produto("Notebook", 4899.89, 0.32, 0.0);
        Produto p3 = new Produto("Caderno", 30.0, 0.45, 0.0);
        Produto p4 = new Produto("Impressora", 1200.0, 0.40, 0.0);
        Produto p5 = new Produto("iPad", 3100.0, 0.29, 0.0);
        Produto p6 = new Produto("Relogio", 1900.0, 0.12, 0.0);
        Produto p7 = new Produto("Monitor", 800.0, 0.3, 0.0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> bigDescount = p -> p.desc >= 0.3;
        Predicate<Produto> free = p -> p.frete == 0;
        Predicate<Produto> relevancia = p -> p.preco >= 500;
        Function<Produto, String> chamada = p -> "Aproveite! " + p.nome + " por R$ " + p.preco;

        produtos.stream().filter(bigDescount).filter(free).filter(relevancia).map(chamada).forEach(System.out::println);

    }
}
