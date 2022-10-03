package Streams;

public class MediaTeste {
    public static void main(String[] args) {
        Media m1 = new Media().getAdd(8.3).getAdd(6.7);
        Media m2 = new Media().getAdd(7.9).getAdd(6.6);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combo(m1, m2).getValor());
    }
}
