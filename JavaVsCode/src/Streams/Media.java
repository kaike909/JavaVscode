package Streams;

public class Media {
    private double ttl;
    private int qtd;

    public Media getAdd(double valor) {
        this.ttl += valor;
        this.qtd++;
        return this;
    }

    public double getValor() {
        return this.ttl / this.qtd;
    }

    public static Media combo(Media m1, Media m2) {
        Media result = new Media();
        result.ttl = m1.ttl + m2.ttl;
        result.qtd = m1.qtd + m2.qtd;
        return result;
    }

}
