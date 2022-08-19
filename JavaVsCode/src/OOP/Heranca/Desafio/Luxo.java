package OOP.Heranca.Desafio;

public interface Luxo {
    
    void ligarAr();
    void desligarAr();
    
    default int velocidadeDoAr(){
        return 1;
    }

}
