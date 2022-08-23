package Lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };
        System.out.println(calc.apply(2.0, 3.0));
        
        BinaryOperator<Double> mult = (x, y) -> {
            return x * y;
        };
        System.out.println(mult.apply(2.0, 3.0));
        
        BinaryOperator<Double> pot = (x, y) -> {
            return Math.pow(x, y);
        };
        System.out.println(pot.apply(2.0, 3.0));

    }
}
