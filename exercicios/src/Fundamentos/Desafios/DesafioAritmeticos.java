package Fundamentos.Desafios;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        int a = 6 * (3 + 2);
        int b = (int) Math.pow(a, 2);
        int c = 3 * 2;
        int d = b / c;

        int e = (1 - 5) * (2 - 7) / 2;
        int f = (int) Math.pow(e, 2);
        int g = d - f;

        int h = (int) Math.pow(g, 3) / (int) Math.pow(10, 3);

        System.out.println(b);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        
    }
}
