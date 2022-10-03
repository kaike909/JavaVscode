package Padroes.Observer;

public class Namorada implements ChegadaAnivObserv {

    public void chegou(ChegadaAnivEvent event) {
        System.out.println("Avisar convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar um pouco...");
        System.out.println("SURPRESAAAA!");
    }
}
