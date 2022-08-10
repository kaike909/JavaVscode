package kaike;

import java.util.*;

public class ListaDeArrya {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        System.out.print("Adicione um numero: ");
        lista.add(in.nextInt());
        System.out.print("Adicione um numero: ");
        lista.add(in.nextInt());
        System.out.print("Adicione um numero: ");
        lista.add(in.nextInt());
        System.out.print("Adicione um numero: ");
        lista.add(in.nextInt());
        System.out.print("Adicione um numero: ");
        lista.add(in.nextInt());

        for (Integer integer : lista) {
            System.out.println(integer);
        }

        System.out.println(lista);

        in.close();

    }
}
