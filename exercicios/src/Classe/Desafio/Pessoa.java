package Classe.Desafio;

public class Pessoa {
    // nome , peso, metodo comer() receber outro obj na classe comida

    String nome;
    double peso;

    Pessoa() {
    }

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida c){
        if (c != null){
            this.peso += c.peso;
        }
    }

    String apresenta() {
        return String.format("%s esta pesando %.2f", nome, peso);
    }

}
