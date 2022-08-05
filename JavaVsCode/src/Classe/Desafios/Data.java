package Classe.Desafios;

public class Data {
    int dia, mes, ano;

    Data () {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data (int diaI, int mesI, int anoI) {
        dia = diaI;
        mes = mesI;
        ano = anoI;
    }

    String obterData(){
        return String.format("%d/%d/%d", dia, mes ,ano);
    }

}
