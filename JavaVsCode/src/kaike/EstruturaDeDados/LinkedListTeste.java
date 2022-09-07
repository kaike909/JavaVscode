package kaike.EstruturaDeDados;

public class LinkedListTeste {
    public static void main(String[] args) {
        LinkedList n1 = new LinkedList();

        n1.append(15);
        n1.append(10);
        n1.append(5);
        n1.append(2);
        n1.prepend(26);

        n1.deleteWithValue(15);

        System.out.println(n1.head.data);
    }
}
