package Fundamentos.Operadores;

public class Relacionais {
    public static void main(String[] args) {

        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);

        double nota = 9.3;
        boolean bomComportamento = false;

        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);

    }
}
