package kaike.Observer;

public class Festa {
    public static void main(String[] args) {

        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registObserver(namorada);
        porteiro.monitorar();

    }
}
