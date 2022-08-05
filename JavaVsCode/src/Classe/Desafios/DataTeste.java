package Classe.Desafios;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 28;
        d1.mes = 9;
        d1.ano = 1996;

        System.out.println(d1.obterData());

        var d2 = new Data();
        d2.dia = 10;
        d2.mes = 8;
        d2.ano = 1999;

        System.out.println(d2.obterData());

        Data d3 = new Data();
        System.out.println(d3.obterData());
        
        Data d4 = new Data(2, 1, 2020);
        System.out.println(d4.obterData());

    }
}
