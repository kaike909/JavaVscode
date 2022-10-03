package Controle.Switch;

public class Continue2 {
    public static void main(String[] args) {
        externo: for (int i=0;i<11;i++){
            for (int j=0;j<11;j++){
                if(i%2==1){
                    continue externo;
                }
                System.out.printf("[%d  %d]", i, j);
            }
            System.out.println();
        }
        System.out.println("FIM!");
    }
}
