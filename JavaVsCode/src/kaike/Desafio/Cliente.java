package kaike.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    void addItem(Compra compra){
        this.compras.add(compra);
    }

    double getTtl() {
        double ttl = 0;
        for (Compra compra : compras) {
            ttl += compra.getTtl();
        }
        return ttl;
    }

}
