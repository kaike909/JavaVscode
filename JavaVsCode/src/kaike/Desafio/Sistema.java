package kaike.Desafio;

public class Sistema {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Carlos Henrique");

        Compra compra1 = new Compra();
        compra1.addItem(new Produto("HS60 PRO Surround 7.1", 249.99), 1);

        Compra compra2 = new Compra();
        compra2.addItem(new Produto("Manga One Punch Man", 24.99), 20);

        cliente1.addItem(compra1);
        cliente1.addItem(compra2);

        System.out.println(cliente1.getTtl());

    }
}
