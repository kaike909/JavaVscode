package OOP.Heranca.Teste;

import OOP.Heranca.Desafio.Civic;
import OOP.Heranca.Desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Civic c1 = new Civic();
        c1.acelerar();
        System.out.println(c1);
        c1.acelerar();
        System.out.println(c1);
        c1.acelerar();
        c1.ligarAr();
        System.out.println(c1);
        c1.acelerar();
        c1.desligarAr();
        System.out.println(c1);
        Ferrari f1 = new Ferrari(400);
        f1.acelerar();
        f1.ligarTurbo();
        System.out.println(f1);
        f1.acelerar();
        f1.frear();
        System.out.println(f1);
        f1.acelerar();
        f1.desligarTurbo();
        f1.frear();
        System.out.println(f1);
        f1.acelerar();
        f1.frear();
        System.out.println(f1);
        f1.acelerar();
        f1.frear();
        System.out.println(f1);
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        System.out.println(f1);
    }
}
