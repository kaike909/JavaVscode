package Fundamentos.Desafios;

public class DesafioBhaskara {
    public static void main(String[] args) {
        double a = 1;
        double b = 12;
        double c = -13;

        double delta = Math.pow(b, 2) - (4 * a * c);

        System.out.printf("O valor de delta é: %.1f", delta);
    }
}
