package Colecoes;

import java.util.*;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // add e offer -> adicionam elementos na fila
        //Diferença eh o comportamento quando a fila esta cheia!
        //Quando a fila esta cheia
        fila.add("Ana"); //Retorna false
        fila.offer("Bia"); // Lanca uma excecao
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");
        
        // Peek Element -> obter proximo elemento na fila (Sem remover)
        //Diferença eh o comportamento quando a fila esta cheia!
        //Quando a fila esta vazia!
        System.out.println(fila.peek()); //retorna NULL 
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lanca uma excecao

        for (String nomes : fila) {
            System.out.println(nomes);
        }

        // fila.size();
        // fila.clear();
        // fila.isEmpty();

        // Poll e Remove -> obter o proximo elemento da fila e remove!

        // Diferenca e o comportamento ocorre quando a fila esta vazia!
        System.out.println(fila.poll()); //retorna NULL
        System.out.println(fila.remove()); // Lanca uma excecao
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // fila.contains(...);

    }
}
