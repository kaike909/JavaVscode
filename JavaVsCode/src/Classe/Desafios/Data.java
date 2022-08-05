package Classe.Desafios;

public class Data {
    int dia, mes, ano;

    String obterData(){
        return String.format("%d/%d/%d", dia, mes ,ano);
    }

}
