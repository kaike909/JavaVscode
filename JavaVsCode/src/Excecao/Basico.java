package Excecao;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            printAluno(a1);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocoreu o erro: " + e.getMessage());
        }

        System.out.println("Fim :)");

    }

    public static void printAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }

}