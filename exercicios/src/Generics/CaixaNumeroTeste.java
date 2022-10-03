package Generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.pocket(1.2);
        System.out.println(caixaA.open());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.pocket(123);
        System.out.println(caixaB.open());
    }
}
