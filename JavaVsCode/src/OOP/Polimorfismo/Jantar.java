package OOP.Polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(75.4);

        Comida ing1 = new Arroz(0.25);
        Comida ing2 = new Feijao(0.18);
        Comida ing3 = new Carne(0.3);
        Comida ing4 = new Carne(0.4);
        Comida sobremesa = new Sorvete(0.45);

        System.out.println(convidado);

        convidado.comer(ing1);
        convidado.comer(ing2);
        convidado.comer(ing3);
        convidado.comer(ing4);
        convidado.comer(sobremesa);

        System.out.println(convidado);

    }

}
