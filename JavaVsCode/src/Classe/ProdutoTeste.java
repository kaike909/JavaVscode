package Classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.printf("R$ %.2f\n", Produto.precoComDesconto(p1.preco, 
        p1.desconto));
        
        System.out.println(p2.nome);
        System.out.printf("R$ %.2f\n", Produto.precoComDesconto(p2.preco, 
        p2.desconto));

        System.out.printf("\nMedia de preco dos produtos = R$ %.2f", Produto.
        media(Produto.precoComDesconto(p1.preco, p1.desconto),Produto.
        precoComDesconto(p2.preco, p2.desconto)));

    }
}
