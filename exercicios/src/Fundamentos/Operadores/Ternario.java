package Fundamentos.Operadores;

public class Ternario {
    public static void main(String[] args) {
        
        double media = 4.6;

        String recuperacao = media >= 5.0 ? "em recuperacao" : "reprovado";
        String resultado = media >= 7.0 ? "Aprovado" : recuperacao;

        System.out.printf("O aluno esta %s", resultado);

    }
}
