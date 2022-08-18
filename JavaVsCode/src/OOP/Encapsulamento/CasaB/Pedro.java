package OOP.Encapsulamento.CasaB;

import OOP.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {
    
    void testeAcesso() {
        // System.out.println(segredo);
        // System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
        System.out.println(new Ana().todosSabem);
        
    }

}
