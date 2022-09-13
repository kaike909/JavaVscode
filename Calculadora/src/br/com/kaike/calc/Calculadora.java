package br.com.kaike.calc;

import java.awt.*;
import javax.swing.JFrame;

import br.com.kaike.calc.visao.Display;
import br.com.kaike.calc.visao.Teclado;

public class Calculadora extends JFrame {

    public Calculadora() {

        organizarLayout();

        // setUndecorated(true);
        setName("Calculadora");
        setSize(295, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void organizarLayout() {

        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(296, 75));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new Calculadora();
    }

}
