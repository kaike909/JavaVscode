package Classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("NoteBook", 4356.89);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        System.out.println(p1.nome);
        double precoFinal1 = p1.precoComDesconto(0.45);
        System.out.printf("R$ %.2f\n", precoFinal1);
        
        System.out.println(p2.nome);
        double precoFinal2 = p2.precoComDesconto();
        System.out.printf("R$ %.2f\n", precoFinal2);

        double media = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Media de preco dos produtos = R$ %.2f", media);

    }
}
