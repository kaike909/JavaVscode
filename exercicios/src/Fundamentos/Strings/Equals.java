package Fundamentos.Strings;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {

        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));
        
        Scanner in = new Scanner(System.in);
        
        String s2 = in.nextLine();
        System.out.println(s2);
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));
        
        in.close();
    }
}
