package br.com.kaike.cm;

import br.com.kaike.cm.modelo.Tabuleiro;
import br.com.kaike.cm.visao.ConsoleTab;

public class Aplicacao {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);

        new ConsoleTab(tabuleiro);

    }
}
