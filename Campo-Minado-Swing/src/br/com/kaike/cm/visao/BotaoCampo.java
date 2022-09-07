package br.com.kaike.cm.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.event.*;

import br.com.kaike.cm.modelo.Campo;
import br.com.kaike.cm.modelo.CampoEvento;
import br.com.kaike.cm.modelo.CampoObservador;

public class BotaoCampo extends JButton
        implements CampoObservador, MouseInputListener {

    private final Color BG_Standard = new Color(221, 219, 208);
    private final Color BG_Mark = new Color(99, 234, 255);
    private final Color BG_Explode = new Color(189, 76, 55);
    private final Color Green_Text = new Color(0, 100, 0);

    private Campo campo;

    public BotaoCampo(Campo campo) {
        this.campo = campo;
        setBackground(BG_Standard);
        setOpaque(true);
        setBorder(BorderFactory.createBevelBorder(0));

        addMouseListener(this);

        campo.registrarObservador(this);
    }

    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        switch (evento) {
            case ABRIR:
                aplicarEstiloAbrir();
                break;
            case MARCAR:
                aplicarEstiloMarcar();
                break;
            case EXPLODIR:
                aplicarEstiloExplodir();
                break;
            default:
                aplicarEstiloPadrao();
        }

        SwingUtilities.invokeLater(() -> {
            repaint();
            validate();
        });

    }

    private void aplicarEstiloAbrir() {

        setBorder(BorderFactory.createLineBorder(Color.gray));

        if (campo.isMinado()) {
            setBackground(BG_Explode);
            return;
        }

        setBackground(BG_Standard);

        switch (campo.minasNaVizinhanca()) {
            case 1:
                setForeground(Color.BLUE);
                break;
            case 2:
                setForeground(Green_Text);
                break;
            case 3:
                setForeground(Color.RED);
                break;
            case 4:
                setForeground(Color.magenta);
                break;
            case 5:
                setForeground(Color.orange);
                break;
            case 6:
                setForeground(Color.YELLOW);
                break;
            default:
                setForeground(Color.BLACK);
        }
        String valor = !campo.vizinhancaSegura() ? campo.minasNaVizinhanca() + "" : "";
        setText(valor);
    }

    private void aplicarEstiloMarcar() {
        setBackground(BG_Mark);
        setForeground(Color.BLACK);
        setText("M");
    }

    private void aplicarEstiloExplodir() {
        setBackground(BG_Explode);
        setForeground(Color.WHITE);
        setText("X");
    }

    private void aplicarEstiloPadrao() {
        setBackground(BG_Standard);
        setBorder(BorderFactory.createBevelBorder(0));
        setText("");
    }

    // Interface dos eventos do mouse

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == 1) {
            campo.abrir();
        } else {
            campo.alternarMarcacao();
        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }

}
