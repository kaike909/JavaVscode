package OOP.Heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari() {
        this(360);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDeltaA(35);
        setDeltaF(25);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDeltaA() {
        if (ligarTurbo && !ligarAr) {
            return 60;
        } else if (ligarTurbo && ligarAr) {
            return 50;
        } else if (!ligarTurbo && !ligarAr) {
            return 45;
        } else {
            return 35;
        }
    }

    // @Override
    // void acelerar() {
    // velocidadeAtual += delta;
    // }

}
