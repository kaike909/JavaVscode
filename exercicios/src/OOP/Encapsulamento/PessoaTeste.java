package OOP.Encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", "Henrique", -25);
        p1.setIdd(121);

        System.out.println(p1); // toString
    }
}
