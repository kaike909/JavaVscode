package Lambda;

public class Produto {
    
    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        double precoFinal = this.preco * (1 - this.desconto);
        return String.format("\nNome: %s\nPreco: R$ %.2f\nDesconto: %.1f %%", this.nome,precoFinal,(this.desconto * 100));
    }

}
