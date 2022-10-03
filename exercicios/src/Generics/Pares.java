package Generics;

import java.util.*;

public class Pares<C extends Number, V> {

    private final Set<Par<C, V>> itens = new LinkedHashSet<>();

    public void add(C chave, V valor) {
        if (chave == null)
            return;

        Par<C, V> novoPar = new Par<C, V>(chave, valor);

        if (itens.contains(novoPar)) {
            itens.remove(novoPar);
        }

        itens.add(novoPar);
    }

    public V getValor(C chave) {
        if (chave == null)
            return null;
        Optional<Par<C, V>> parOpcional = itens.stream().filter(p -> chave.equals(p.getChave())).findFirst();

        return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
    }

}
