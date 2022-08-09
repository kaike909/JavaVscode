package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {
        
        HashSet conj = new HashSet();

        conj.add(1.2);
        conj.add(true);
        conj.add("Teste");
        conj.add(1);
        conj.add('x');

         System.out.printf("TAMANHO EH %d\n", conj.size());
         
         conj.add("Teste");
         System.out.printf("TAMANHO EH %d\n", conj.size());
         
         System.out.println(conj.remove("Teste"));
         System.out.println(conj.remove("teste"));
         System.out.println(conj.remove('x'));

         System.out.printf("TAMANHO EH %d\n", conj.size());

         System.out.println(conj.contains('x'));
         System.out.println(conj.contains(1));
         System.out.println(conj.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conj);

        // conj.addAll(nums); // Uniao entre dois conjuntos
        conj.retainAll(nums);

        System.out.println(conj);
        
        conj.clear();
        System.out.println(conj);

    }
}
