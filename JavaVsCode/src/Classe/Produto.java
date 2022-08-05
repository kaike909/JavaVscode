package Classe;

public class Produto {

    String nome;
    double preco, desconto;

    static double precoComDesconto(double a, double b){
        double desc = a * (1 - b);
        return desc;
    }

    static double media(double a, double b){
        double media = (a + b) / 2;
        return media;
    }

}
