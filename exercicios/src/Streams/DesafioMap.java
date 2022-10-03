package Streams;

import java.util.*;
import java.util.function.*;

public class DesafioMap {
    /*
     * 1. Numero para String binaria... 6 => "110"
     * 2. Inverter a String... "110" => "011" => 3
     * 3. Converter de volta para inteiro => "011" => 3
     */
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> paraBinario = Integer::toBinaryString;
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);

        nums.stream().map(paraBinario).map(inverter).map(binarioParaInt).forEach(System.out::println);

    }

}
