package OOP.Heranca.Desafio;

public class Carro {
    
    final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    protected int deltaA = 5;
    protected int deltaF = 5;

    protected Carro(int VelocidadeMaxima) {
        VELOCIDADE_MAXIMA = VelocidadeMaxima;
    }

    public void acelerar(){
        if (velocidadeAtual + deltaA > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += deltaA;
        }
    }

    public void frear() {
        if (velocidadeAtual >= deltaF) {
            velocidadeAtual -= deltaF;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return "Velocidade atual " + velocidadeAtual + " Km/h";
    }

}
