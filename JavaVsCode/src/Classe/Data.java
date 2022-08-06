package Classe;

public class Data {
    int dia, mes, ano;
    
    Data () {
        this(1, 1, 1970);
    }
    
    Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    /*  Valores padroes
     *  byte, short, int, long -> 0
     *  float, double -> 0.0
     *  boolean -> false
     *  char -> '\u0000'
     */

    String obterData(){
        final String form = "%d/%d/%d";
        return String.format(form, dia, mes ,ano);
    }

}
