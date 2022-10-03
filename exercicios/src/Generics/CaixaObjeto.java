package Generics;

public class CaixaObjeto {

    private Object coisa;

    public void pocket(Object coisa) {
        this.coisa = coisa;
    }

    public Object open() {
        return coisa;
    }

}
