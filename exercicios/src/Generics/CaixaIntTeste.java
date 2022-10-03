package Generics;

public class CaixaIntTeste {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();
        caixaA.pocket(123);

        Integer coisaA = caixaA.open();
        System.out.println(coisaA);
    }
}
