package Colecoes;

import java.util.*;

public class ConjuntoComportado {
    public static void main(String[] args) {
        
        // Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>();

        lista.add("Carlos");
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luca");

        for (String candidato : lista) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        // Set<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        for (Integer numeros : nums) {
            System.out.println(numeros);
        }

    }
}
