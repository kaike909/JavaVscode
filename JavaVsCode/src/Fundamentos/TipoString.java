package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(3));

        String s = "Boa tarde!";
        System.out.println(s.concat("!!!"));
        var nome = "Carlos";
        var sobrenome = "Henrique";
        var idade = 26;
        var salario = 26500.897;
        System.out.printf("O funcionario %s %s tem %d anos e ganha R$ %.2f por dia!\n\n", nome, sobrenome, idade, salario);
        System.out.println(s.substring(4, 9));
    }
}
