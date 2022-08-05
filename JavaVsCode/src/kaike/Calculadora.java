package kaike;

public class Calculadora {
    public static int Calc(int a, int b, String p){
        int c = 0;
        if (p.equals("+")) {
            return (int) (c = a + b);
        } else if (p.equals("-")) {
            return (int) (c = a = b);
        } else if (p.equals("*")) {
            return (int) (c = a * b);
        } else if (p.equals("/")){
            return (int) (c = a / b);
        }
        return c;
    }
}
