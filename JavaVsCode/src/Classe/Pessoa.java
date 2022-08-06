package Classe;

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

    double comer(Comida com){
        return com.peso + peso;
    }

}
