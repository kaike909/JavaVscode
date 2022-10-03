package OOP.Composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adcItem(String nome, int qtd, double preco){
        this.adcItem(new Item(nome, qtd, preco));
    }
    
    void adcItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    double getTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.qtd * item.preco;
        }

        return total;
    }

}
