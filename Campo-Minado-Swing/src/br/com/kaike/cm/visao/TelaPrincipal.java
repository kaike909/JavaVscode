package br.com.kaike.cm.visao;

import javax.swing.JFrame;

import br.com.kaike.cm.modelo.Tabuleiro;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {

        Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
        add(new PainelTabuleiro(tabuleiro));

        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    // Easy 10 minas, 8 linhas e 10 colunas
    // Medium 40 minhas, 14 linhas e 18 colunas
    // Hard 99 minhas, 20 linhas e 24 colunas
    public static void main(String[] args) {
        new TelaPrincipal();
    }

}
