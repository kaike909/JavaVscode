package Colecoes;

import java.util.*;

public class Lista {
    public static void main(String[] args) {
        
        ArrayList<Usuario> Lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        Lista.add(u1);
        Lista.add(new Usuario("Carlos"));
        Lista.add(new Usuario("Lia"));
        Lista.add(new Usuario("Bia"));
        Lista.add(new Usuario("Manu"));

        System.out.println(Lista.get(1)); // acessar pelo indice

        Lista.remove(1);
        Lista.remove(new Usuario("Manu"));

        System.out.println(Lista.contains(new Usuario("Lia")));
        System.out.println(Lista.contains(new Usuario("Ana")));
        
        for (Usuario u : Lista){
            System.out.println(u.nome);
        }

    }
}
