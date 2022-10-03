package OOP.Composicao.Desafio;

import java.util.*;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void addItem(Produto p, int qtd){
        this.itens.add(new Item(p, qtd));
    }

    void addItem(String nome, double preco, int qtd){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtd));
    }

    double obterValorTtl(){
        double ttl = 0;
        for (Item item : itens) {
            ttl += item.qtd * item.produto.preco;
        }
        return ttl;
    }

}
