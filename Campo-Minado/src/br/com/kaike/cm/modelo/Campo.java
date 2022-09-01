package br.com.kaike.cm.modelo;

import java.util.*;
import br.com.kaike.cm.excecao.ExplosaoException;

public class Campo {

    private final int lin;
    private final int col;

    private boolean open = false;
    private boolean mined = false;
    private boolean marked = false;

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

    public void makeMarker() {
        if (!open) {
            marked = !marked;
        }
    }

    public boolean open() {
        if (!open && !marked) {
            open = true;
            if (mined) {
                throw new ExplosaoException();
            }
            if (safeNeighbor()) {
                neighbors.forEach(v -> v.open());
            }
            return true;
        } else {
            return false;
        }
    }

    boolean safeNeighbor() {
        return neighbors.stream().noneMatch(v -> v.mined);
    }

    public void mine() {
        mined = true;
    }

    public boolean isMined() {
        return mined;
    }

    public boolean isMarked() {
        return marked;
    }

    void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isClosed() {
        return !open;
    }

    public int getLin() {
        return lin;
    }

    public int getCol() {
        return col;
    }

    boolean objectiveAcomplished() {
        boolean unraveled = !mined && open;
        boolean protect = mined && marked;
        return unraveled || protect;
    }

    public long minesOnNeighbor() {
        return neighbors.stream().filter(v -> v.mined).count();
    }

    void restart() {
        open = false;
        mined = false;
        marked = false;
    }

    public String toString() {
        if (marked) {
            return "x";
        } else if (open && mined) {
            return "*";
        } else if (open && minesOnNeighbor() > 0) {
            return Long.toString(minesOnNeighbor());
        } else if (open) {
            return "-";
        } else {
            return "?";
        }
    }

}
