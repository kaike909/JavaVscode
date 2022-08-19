package kaike.Banco;

public class Sistema {
    public static void main(String[] args) {
        
        Banco cliente1 = new Banco("Carlos Henrique", 44046539801L, 123456, 0.00);

        System.out.println(cliente1.dinheiro);
        
        cliente1.setDinheiro(12000);
        System.out.println(cliente1.dinheiro);

        cliente1.receber(25000.00);
        System.out.println(cliente1.nome);
        System.out.println(cliente1.cpf);
        System.out.println(cliente1.conta);
        System.out.println(cliente1.dinheiro);
        System.out.println(cliente1);
        
        cliente1.transferir(15000);
        System.out.println(cliente1.dinheiro);
        cliente1.transferir(15000);
        System.out.println(cliente1.dinheiro);
        cliente1.transferir(15000);
        System.out.println(cliente1.dinheiro);
        cliente1.receber(25000.00);
        System.out.println(cliente1.dinheiro);
        cliente1.receber(25000.00);
        System.out.println(cliente1.dinheiro);
        cliente1.receber(25000.00);
        System.out.println(cliente1.dinheiro);
        cliente1.receber(25000.00);
        System.out.println(cliente1.dinheiro);
        cliente1.receber(25000.00);
        System.out.println(cliente1.dinheiro);
        cliente1.transferir(18000);
        System.out.println(cliente1.dinheiro);
        System.out.println(cliente1);
        
    }
}
