package Classe;

public class AreaCirc {
    double raio;

    AreaCirc(double raioI){
        raio = raioI;
    }

    String area(){
        return String.format("%.2f", Math.PI * Math.pow(raio, 2));
    }

    static String area(double raio){
        return String.format("%.2f", Math.PI * Math.pow(raio, 2));
    }

}
