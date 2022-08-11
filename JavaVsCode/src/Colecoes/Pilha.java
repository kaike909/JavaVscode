package Colecoes;

import java.util.*;

public class Pilha {
    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for (String livro : livros) {
            System.out.println(livro);
        }

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        // System.out.println(livros.remove());

        // livros.size();
        // livros.clear();
        // livros.contains();
        // livros.isEmpty();

    }
}
