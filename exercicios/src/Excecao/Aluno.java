package Excecao;

public class Aluno {

    public final String nome;
    public final double nota;
    public final boolean bomComp;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean bomComp) {
        this.nome = nome;
        this.nota = nota;
        this.bomComp = bomComp;
    }

    public String toString() {
        return nome + " tem nota " + nota;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Aluno other = (Aluno) obj;
        if (bomComp != other.bomComp) {
            return false;
        }
        if (nome == null) {
            if (other.nome != null) {
                return false;
            } else if (!nome.equals(other.nome)) {
                return false;
            }
            if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota)) {
                return false;
            }
        }
        return true;

    }

}
