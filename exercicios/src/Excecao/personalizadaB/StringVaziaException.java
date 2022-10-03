package Excecao.personalizadaB;

public class StringVaziaException extends Exception {

    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' esta negativo", nomeDoAtributo);
    }

}
