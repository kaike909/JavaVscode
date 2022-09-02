package kaike.Observer;

import java.util.*;

public class Porteiro {

    private List<ChegadaAnivObserv> observers = new ArrayList<>();

    public void registObserver(ChegadaAnivObserv observ) {
        observers.add(observ);
    }

    public void monitorar() {

        Scanner in = new Scanner(System.in);
        String valor = "";

        while (!"exit".equalsIgnoreCase(valor)) {

            System.out.print("Aniversariante chegou? ");
            valor = in.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                ChegadaAnivEvent event = new ChegadaAnivEvent(new Date());
                observers.stream().forEach(o -> o.chegou(event));
                valor = "exit";
            } else {
                System.out.println("Alarme falso...");
            }

        }

        in.close();

    }

}
