package Classe;

public class Produto {

    String nome;
    double preco; 
    static double desconto = 0.25;

    Produto() {
    }

    Produto(String nomeIni) {
        nome = nomeIni;
    }

    Produto(String nomeIni, double precoini) {
        nome = nomeIni;
        preco = precoini;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descGerente) {
        return preco * (1 - desconto - descGerente);
    }

    static double media(double a, double b) {
        double media = (a + b) / 2;
        return media;
    }

}
