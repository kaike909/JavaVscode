package br.com.kaike.cm.modelo;

import java.util.*;

public class Campo {

    private final int lin;
    private final int col;

    private boolean open;
    private boolean mined;
    private boolean marked;

    private List<Campo> neighbors = new ArrayList<>();

    public Campo(int lin, int col) {
        this.lin = lin;
        this.col = col;
    }

    public Campo(int lin, int col, boolean mined) {
        this.lin = lin;
        this.col = col;
        this.mined = mined;
    }

    public boolean addNeighbor(Campo neighbor) {
        boolean difLin = lin != neighbor.lin;
        boolean difCol = col != neighbor.col;
        boolean diagonal = difLin && difCol;

        int deltaLin = Math.abs(lin - neighbor.lin);
        int deltaCol = Math.abs(col - neighbor.col);
        int deltaGer = deltaCol + deltaLin;

        if (deltaGer == 1 && !diagonal) {
            neighbors.add(neighbor);
            return true;
        } else if (deltaGer == 2 && diagonal) {
            neighbors.add(neighbor);
            return true;
        } else {
            return false;
        }

    }

}
