package Generics;

public class Caixa<T> {

    private T coisa;

    public void pocket(T coisa) {
        this.coisa = coisa;
    }

    public T open() {
        return coisa;
    }

}
