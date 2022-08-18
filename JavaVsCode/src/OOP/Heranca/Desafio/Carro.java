package OOP.Heranca.Desafio;

public class Carro {
    
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int deltaA = 5;
    int deltaF = 5;

    Carro(int VelocidadeMaxima) {
        VELOCIDADE_MAXIMA = VelocidadeMaxima;
    }

    void acelerar(){
        if (velocidadeAtual + deltaA > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += deltaA;
        }
    }

    void frear() {
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
