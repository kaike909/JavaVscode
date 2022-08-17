package OOP.Heranca;

public class Jogo {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        Monstro monstro = new Monstro();

        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.SUL);
        monstro.andar(Direcao.LESTE);

        System.out.printf("[%d, %d]\n", heroi.y, heroi.x);
        System.out.printf("[%d, %d]\n", monstro.y, monstro.x);

        System.out.println("Heroi tem => " + heroi.vida);
        System.out.println("Monstro tem => " + monstro.vida);
        
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        
        monstro.andar(Direcao.NORTE);
        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.andar(Direcao.NORTE);
        heroi.atacar(monstro);
        
        System.out.println("Heroi tem => " + heroi.vida);
        System.out.println("Monstro tem => " + monstro.vida);

    }
}
