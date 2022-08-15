package kaike.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void addItem(Produto produto, int qtd) {
        this.itens.add(new Item(produto, qtd));
    }

    void addItem(String nome, double preco, int qtd) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtd));
    }

    double getTtl() {
        double ttl = 0;
        for (Item item : itens) {
            ttl += item.qtd * item.produto.preco;
        }
        return ttl;
    }

}
