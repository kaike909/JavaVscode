package br.com.kaike.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

import br.com.kaike.calc.Modelo.Memoria;
import br.com.kaike.calc.Modelo.MemoriaObservador;

public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label;

    public Display() {
        Memoria.getInstancia().adicionarObservador(this);

        setBackground(new Color(70, 70, 70));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(new Color(255, 255, 255));
        label.setFont(new Font("Falling Sky", Font.PLAIN, 45));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 15));

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }

}
