package Controle.Desafios;

import java.util.Scanner;

public class Desafio0a10ePar {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int x = in.nextInt();
        String resp, par;
        
        
        if (x >=0 && x <= 10){
            resp = "SIM!";
        } else {
            resp = "NAO";
        }

        if (x % 2 == 0){
            par = "SIM!";
        } else {
            par = "NAO!";
        }

        System.out.printf("O numero digitado foi %d\n", x);
        System.out.printf("O numero esta entre 0 e 10? %s\n", resp);
        System.out.printf("O numero é par? %s", par);

        in.close();

    }
}
