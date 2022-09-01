package Generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.pocket(2.3); // double -> Double

        Double coisaA = (Double) caixaA.open();
        System.out.println(coisaA);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.pocket("Ola");

        String coisaB = (String) caixaB.open();
        System.out.println(coisaB);

    }
}
