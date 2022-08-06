package kaike;

public class Second {
        
    int idd;
    String nome, sobrenome;

    String sayAge(){
        return String.format("Voce tem %d anos", idd);
    }

    String sayName(){
        return String.format("Seu nome é %s %s", nome, sobrenome);
    }

}
