package OOP.Heranca.Desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Civic c1 = new Civic();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.toString());
        Ferrari f1 = new Ferrari();
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        System.out.println(f1.toString());
    }
}
