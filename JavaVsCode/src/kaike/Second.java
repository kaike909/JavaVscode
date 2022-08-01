package kaike;

import java.util.*;

public class Second {

    public static void sayName(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = inp.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = inp.nextLine();
        System.out.printf("%s %s e tem %d anos.", nome, sobrenome, sayAge());
        inp.close();
    }

    public static int sayAge(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Digiet a sua idade: ");
        int age = inp.nextInt();
        inp.hasNext();
        inp.close();
        return age;
    }
}
