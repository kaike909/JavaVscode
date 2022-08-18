package OOP.Heranca.Desafio;

public class Ferrari extends Carro{

    public Ferrari() {
        this(360);
    }

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        deltaA = 35;
        deltaF = 25;
    }

    // @Override
    // void acelerar() {
    //     velocidadeAtual += delta;
    // }
    
}
