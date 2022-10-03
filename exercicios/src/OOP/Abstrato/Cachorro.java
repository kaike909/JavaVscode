package OOP.Abstrato;

public class Cachorro extends Mamifero {
    
    @Override
    public String andar() {
        return "Usando as patas";
    }

    @Override
    public String mamar() {
        return "Usando leite";
    }

}
