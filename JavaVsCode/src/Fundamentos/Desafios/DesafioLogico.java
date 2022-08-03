package Fundamentos.Desafios;

public class DesafioLogico {
    public static void main(String[] args) {
        /* Dois casos onde tenho um trabalho na terca e na quinta
         * caso os dois deem certo vou comprar uma tv de 50 pra minha familia
         * caso um deles de certo vou comprar uma tv de 32
         * nos dois casos saio pra tomar sorvete com a familia
         * caso nao de creto nenhum dos dois trabalhos ficamos em casa
         * colocar tbm se nao tomar sorvete, a vida fica mais saudavel
        **/ 

        boolean trab1 = true;
        boolean trab2 = false;
        
        boolean comprouTV50 = trab1 && trab2;
        boolean comprouTV32 = trab1 ^ trab2;
        boolean tomarSorvete = trab1 || trab2;

        // Operadir Unario!
        boolean maisSaudavel = !tomarSorvete;

        System.out.println("Comprou TV ded 50\"? " + comprouTV50);
        System.out.println("Comprou TV ded 32\"? " + comprouTV32);
        System.out.println("Foi tomar sorvete? " + tomarSorvete);
        System.out.println("Mais saudavel? " + maisSaudavel);

    }
}
