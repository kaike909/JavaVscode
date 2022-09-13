package br.com.kaike.calc.visao;

import java.awt.*;
import javax.swing.*;

public class Botao extends JButton {

    public Botao(String texto, Color cor) {
        setText(texto);
        setFont(new Font("Falling Sky", Font.PLAIN, 25));
        setOpaque(true);
        setBackground(cor);
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

}
