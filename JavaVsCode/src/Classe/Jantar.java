package Classe;

public class Jantar {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Carlos Henrique", 74.6);
        Pessoa p2 = new Pessoa("Bianca Morales", 69.8);

        Comida c1 = new Comida("Arroz", 0.2);
        Comida c2 = new Comida("Feijao", 0.15);

        System.out.println(p1.comer(c1));

    }
}
