package Fundamentos;

public class ConversaoPrimitivos {
    public static void main(String[] args) {

        double a = 1.123456788888; // Implicita
        System.out.println(a);
        
        float b = (float) 1.123456788888; // Explicita (CAST)
        System.out.println(b);

        int c = 130;
        byte d = (byte) c;
        System.out.println(d);

    }
}
