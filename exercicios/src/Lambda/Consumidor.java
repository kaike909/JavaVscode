package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        imprimirNome.accept(p1);
        
        Produto p2 = new Produto("NoteBook", 2987.99, 0.19);
        Produto p3 = new Produto("Caderno", 19.90, 0.29);
        Produto p4 = new Produto("Lapis", 4.39, 0.19);
        Produto p5 = new Produto("Celular", 3499.99, 0.29);
        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);

        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
