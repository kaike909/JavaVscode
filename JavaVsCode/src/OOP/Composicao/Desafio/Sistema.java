package OOP.Composicao.Desafio;

public class Sistema {
    public static void main(String[] args) {
        
        Compra compra1 = new Compra();
        compra1.addItem("Caneta", 2.5, 10);
        compra1.addItem(new Produto("Notebook", 2500), 2);

        Compra compra2 = new Compra();
        compra2.addItem("Caderno", 27.9, 7);
        compra2.addItem(new Produto("Impressora", 1500), 3);

        Cliente cliente = new Cliente("Carlos Henrique");
        cliente.addItem(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTtl());

    }
}
