package OOP.Encapsulamento.CasaB;

import OOP.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {
    
    void testeAcesso() {
        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem
        
        // System.out.println(segredo);
        // System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
        System.out.println(new Ana().todosSabem);
    }

}
