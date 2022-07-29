package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionario

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numDeVoos = 542;
        int id = 56789;
        long conta = 1234567891234567894L;

        // Tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2991797103.01;

        // Tipo Booleano
        boolean estaDeFerias = true;

        // Tipo Caractere
        char status = '\u0C26';

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numero de Viagens
        System.out.println(numDeVoos / 2);

        //Pontos por real
        System.out.println(conta / vendasAcumuladas);

        System.out.printf("%d ganha -> %.2f\n", id, salario);
        System.out.printf("Ferias? %b\n", estaDeFerias);
        System.out.println(status);
    }
}
