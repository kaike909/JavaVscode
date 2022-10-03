package Padroes.Observer;

import java.util.*;

public class Porteiro {

    private List<ChegadaAnivObserv> observers = new ArrayList<>();

    public void registObserver(ChegadaAnivObserv observ) {
        observers.add(observ);
    }

    public void monitorar() {

        Scanner in = new Scanner(System.in);
        String valor = "";

        while (!"sair".equalsIgnoreCase(valor)) {
            System.out.print("Aniversariante Chegou?");
            valor = in.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                // Criar o evento
                ChegadaAnivEvent evento = new ChegadaAnivEvent(new Date());
                // Notificar os observers
                observers.stream().forEach(o -> o.chegou(evento));
                valor = "sair";
            } else {
                System.out.println("Alarme falso!");
            }
        }

        in.close();
    }

}
