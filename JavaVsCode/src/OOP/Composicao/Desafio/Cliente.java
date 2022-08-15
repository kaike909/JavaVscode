package OOP.Composicao.Desafio;

import java.util.*;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void addItem(Compra compra){
        this.compras.add(compra);
    }

    double obterValorTtl(){
        double ttl = 0;
        for (Compra compra : compras) {
            ttl = compra.obterValorTtl();
        }
        return ttl;
    }

}
