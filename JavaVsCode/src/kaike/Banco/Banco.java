package kaike.Banco;

public class Banco {

    public String nome;
    public long cpf;
    public int conta;
    public double dinheiro;

    Banco() {}

    Banco(String nome, long cpf, int conta, double dinheiro) {
        setNome(nome);
        setCpf(cpf);
        setConta(conta);
        setDinheiro(dinheiro);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getConta() {
        return this.conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getDinheiro() {
        return this.dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void receber(double d) {
        this.dinheiro += d;
    }

    public void transferir(double d) {
        if (this.dinheiro >= 0) {
            this.dinheiro -= d;
        } else {
            this.dinheiro = 0;
        }
    }

    public String toString() {
        return String.format("Meu nome é %s, meu CPF é %d na conta %d e tenho atualemente R$%.2f na mesma", getNome(),
                getCpf(), getConta(), getDinheiro());
    }

}
