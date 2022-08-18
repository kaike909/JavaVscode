package OOP.Polimorfismo;

public class Comida {
    
    private double peso;

    public Comida(double peso){
        setPeso(peso);
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
