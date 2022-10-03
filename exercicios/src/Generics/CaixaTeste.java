package Generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.pocket("Ola");

        System.out.println(caixaA.open());
    }
}
