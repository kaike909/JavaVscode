package Controle;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe um numero: ");
        int num = Integer.parseInt(valor);

        System.out.println(num);
        if (num % 2  == 0){
            System.out.println("Numero PAR");
        }
        else {
            System.out.println("Numero IMPAR");
        }

    }
}
