package Classe;

public class Produto {

    String nome;
    double preco, desconto;

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    
    double precoComDesconto(double descGerente){
        return preco * (1 - desconto - descGerente);
    }

    static double media(double a, double b){
        double media = (a + b) / 2;
        return media;
    }

}
