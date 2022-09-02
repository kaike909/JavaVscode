package Padroes.Observer;

import java.util.Date;

public class ChegadaAnivEvent {

    private final Date moment;

    public Date getMoment() {
        return moment;
    }

    public ChegadaAnivEvent(Date moment) {
        this.moment = moment;
    }

}
