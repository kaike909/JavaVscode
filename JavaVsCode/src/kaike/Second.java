package kaike;

import java.util.*;

import javax.swing.JOptionPane;

public class Second {
        
    public static String sayAge(){
        Scanner in = new Scanner(System.in);
        String age = JOptionPane.showInputDialog("Digite a sua idade: ");
        in.close();
        return age;
    }
    
    public static void sayName(){
        Scanner in = new Scanner(System.in);
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome: ");
        System.out.printf("%s %s tem %d anos.", nome, sobrenome, sayAge());
        in.close();
    }

}
