package Classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // Atribuicao por valor (PRIMITIVO)

        a++;
        b--;
        System.out.printf("%.1f %.1f\n", a, b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; // Atribuicao por referencia (OBJETO)

        d1.dia = 31;
        d1.mes = 12;

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());
        
        voltarAoPadrao(d1);
        
        System.out.println(d1.obterData());
        System.out.println(d2.obterData());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarAoPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a) {
        a++;
    }

}
