package Padroes.Observer;

public class Festa {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registObserver(namorada);
        porteiro.registObserver(e -> System.out.println(e.getMoment()));
        porteiro.monitorar();
    }
}
