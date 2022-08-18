package OOP.Encapsulamento;

public class Pessoa {

    private int idd;

    public Pessoa(int idd){
        setIdd(idd);
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

}
