package OOP.Heranca.Desafio;

public class Civic extends Carro implements Luxo {

    private boolean ligarAr = false;

    public Civic() {
        super(240);
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
        if (!ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }

}
