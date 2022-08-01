package Fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        String s = "texto";
        s.toUpperCase();

        //Wrappers sao a versao objeto dos tipos primitivos!
        int a = 123;
        System.out.println(a);
    }
}
