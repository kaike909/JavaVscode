package OOP.Composicao.Desafio;

public class Item {
    
    final int qtd;
    final Produto produto;

    Item(Produto produto, int qtd){
        this.produto = produto;
        this.qtd = qtd;
    }

}
