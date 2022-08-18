package OOP.Encapsulamento;

public class Pessoa {

    private String nome;
    private int idd;

    public Pessoa(String nome, int idd){
        setNome(nome);
        setIdd(idd);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter
    public int getIdd() {
        return idd;
    }

    // Setter
    public void setIdd(int newIdd) {
        newIdd = Math.abs(newIdd);
        if (newIdd >= 0 && newIdd <= 120) {
            this.idd = newIdd;
        }
    }

    @Override
    public String toString() {
        return String.format("Ola me chamo %s e tenho %d anos!!", getNome(), getIdd());
    }

}
