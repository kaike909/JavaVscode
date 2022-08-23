package Lambda;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo soma = (x, y) -> {
            return x + y;
        };
        System.out.println(soma.executar(2, 3));

        Calculo multi = (x, y) -> {
            return x * y;
        };
        System.out.println(multi.executar(2, 3));
        
        Calculo potencia = (x, y) -> {
            return Math.pow(x, y);
        };
        System.out.println(potencia.executar(2, 3));

    }
}
