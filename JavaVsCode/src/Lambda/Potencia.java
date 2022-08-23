package Lambda;

public class Potencia implements Calculo {
    
    @Override
    public double executar(double a, double b) {
        return Math.pow(a, b);
    }

}
