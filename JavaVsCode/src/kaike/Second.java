package kaike;

import java.util.*;

public class Second {

    public static void sayName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = in.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = in.nextLine();
        System.out.printf("%s %s e tem %d anos.", nome, sobrenome, sayAge());
        in.close();
    }

    public static int sayAge(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digiet a sua idade: ");
        int age = in.nextInt();
        in.nextLine();
        in.close();
        return age;
    }
}
