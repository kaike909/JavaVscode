package br.com.kaike.cm.modelo;

import java.util.*;
import java.util.function.Predicate;

import br.com.kaike.cm.excecao.ExplosaoException;

public class Tabuleiro {

    private int lin;
    private int col;
    private int mines;

    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int lin, int col, int mines) {
        this.lin = lin;
        this.col = col;
        this.mines = mines;

        generateCamps();
        associateNeighbors();
        sortMines();
    }

    public void open(int lin, int col) {
        try {
            campos.parallelStream()
                    .filter(c -> c.getLin() == lin && c.getCol() == col)
                    .findFirst()
                    .ifPresent(c -> c.open());
        } catch (ExplosaoException e) {
            campos.forEach(c -> c.setOpen(true));
            throw e;
        }
    }

    public void mark(int lin, int col) {
        campos.parallelStream()
                .filter(c -> c.getLin() == lin && c.getCol() == col)
                .findFirst()
                .ifPresent(c -> c.makeMarker());
    }

    private void generateCamps() {
        for (int l = 0; l < lin; l++) {
            for (int c = 0; c < col; c++) {
                campos.add(new Campo(l + 1, c + 1));
            }
        }
    }

    private void associateNeighbors() {
        for (Campo c1 : campos) {
            for (Campo c2 : campos) {
                c1.addNeighbor(c2);
            }
        }
    }

    private void sortMines() {
        long armedMines = 0;
        Predicate<Campo> mined = c -> c.isMined();

        do {
            int random = (int) (Math.random() * campos.size());
            campos.get(random).mine();
            armedMines = campos.stream().filter(mined).count();
        } while (armedMines < mines);
    }

    public boolean objectiveAcomplished() {
        return campos.stream().allMatch(c -> c.objectiveAcomplished());
    }

    public void restart() {
        campos.stream().forEach(c -> c.restart());
        sortMines();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("  ");
        for (int c = 0; c < col; c++) {
            sb.append("  ");
            sb.append(c + 1);
            sb.append("  ");
        }

        sb.append("\n");

        int i = 0;
        for (int l = 0; l < lin; l++) {
            sb.append(l + 1);
            sb.append(" ");
            for (int c = 0; c < col; c++) {
                sb.append("[ ");
                sb.append(campos.get(i));
                sb.append(" ]");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
