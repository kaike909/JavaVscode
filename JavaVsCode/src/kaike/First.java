package kaike;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        Second eu = new Second();
        System.out.print("Digite sua idade: ");
        eu.idd = in.nextInt();
        System.out.print("Digite o seu nome: ");
        eu.nome = in.next();
        System.out.print("Digite o seu sobrenome: ");
        eu.sobrenome = in.next();

        Third job = new Third();

        System.out.print("Digite o seu cargo: ");
        job.job = in.next();
        System.out.print("Digite o seu salario: ");
        job.slr = in.nextDouble();

        System.out.println(eu.sayName());
        System.out.println(eu.sayAge());
        System.out.println(job.myJob(eu));

        System.out.println(Calculadora.Calc(2, 4, "*"));

        in.close();

    }
}
