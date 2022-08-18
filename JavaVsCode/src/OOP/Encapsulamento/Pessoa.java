package OOP.Encapsulamento;

public class Pessoa {

    private String nome, sobrenome;
    private int idd;

    public Pessoa(String nome, String sobrenome,  int idd){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdd(idd);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return String.format("%s %s", getNome(), getSobrenome());
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
        return String.format("Ola me chamo %s e tenho %d anos!!", getNomeCompleto(), getIdd());
    }

}
