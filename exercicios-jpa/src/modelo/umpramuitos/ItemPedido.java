package modelo.umpramuitos;

import javax.persistence.*;

import modelo.basico.Produto;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pedido pedido;

    // esse eh o valor padrao de fecth (...ToOne = EAGER)
    @ManyToOne(fetch = FetchType.EAGER)
    private Produto produto;

    @Column(nullable = false)
    private Integer qtd;

    @Column(nullable = false)
    private Double preco;

    public ItemPedido() {

    }

    public ItemPedido(Pedido pedido, Produto produto, Integer qtd) {
        this.setPedido(pedido);
        this.setProduto(produto);
        this.setQtd(qtd);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;

        if (produto != null && this.preco == null) {
            this.setPreco(produto.getPreco());
        }
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
