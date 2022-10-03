package Classe.Desafio;

public class Jantar {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Carlos Henrique", 74.6);
        Pessoa p2 = new Pessoa("Bianca Morales", 69.8);

        Comida c1 = new Comida("Arroz", 0.22);
        Comida c2 = new Comida("Feijao", 0.3);

        System.out.println(p1.apresenta());
        p1.comer(c1);
        System.out.println(p1.apresenta());
        p1.comer(c1);
        System.out.println(p1.apresenta());
        p1.comer(c2);
        System.out.println(p1.apresenta());

        System.out.println(p2.apresenta());
        p2.comer(c1);
        System.out.println(p2.apresenta());
        p2.comer(c1);
        System.out.println(p2.apresenta());
        p2.comer(c2);
        System.out.println(p2.apresenta());

    }
}
