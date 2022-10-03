package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String lastLang1 = (String) ListaUtil.getUltimo1(langs);
        System.out.println(lastLang1);

        Integer lastNum1 = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(lastNum1);

        String lastLang2 = ListaUtil.getUltimo2(langs);
        System.out.println(lastLang2);

        Integer lastNum2 = ListaUtil.getUltimo2(nums);
        System.out.println(lastNum2);
    }
}
