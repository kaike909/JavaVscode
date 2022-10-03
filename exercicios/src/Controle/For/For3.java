package Controle.For;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.printf("[%d %d]",i, j);
            }
            System.out.println();
        }

        in.close();
        
    }
}
