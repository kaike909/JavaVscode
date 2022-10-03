package OOP.Heranca.Desafio;

public class Carro {
    
    final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    private int deltaA = 5;
    private int deltaF = 5;
    
    protected Carro(int VelocidadeMaxima) {
        VELOCIDADE_MAXIMA = VelocidadeMaxima;
    }
    
    public void acelerar(){
        if (velocidadeAtual + getDeltaA() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDeltaA();
        }
    }
    
    public void frear() {
        if (velocidadeAtual >= getDeltaF()) {
            velocidadeAtual -= getDeltaF();
        } else {
            velocidadeAtual = 0;
        }
    }
    
    public int getDeltaA() {
        return this.deltaA;
    }

    public void setDeltaA(int deltaA) {
        this.deltaA = deltaA;
    }

    public int getDeltaF() {
        return this.deltaF;
    }

    public void setDeltaF(int deltaF) {
        this.deltaF = deltaF;
    }

    public String toString(){
        return "Velocidade atual " + velocidadeAtual + " Km/h";
    }

}
