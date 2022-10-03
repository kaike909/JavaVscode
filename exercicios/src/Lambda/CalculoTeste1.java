package Lambda;

public class CalculoTeste1 {
    public static void main(String[] args) {

        Calculo soma = new Somar();
        System.out.println(soma.executar(2, 3));

        Calculo multiplicacao = new Multiplicar();
        System.out.println(multiplicacao.executar(2, 3F));

        Calculo potencia = new Potencia();
        System.out.println(potencia.executar(2, 3));

    }
}
