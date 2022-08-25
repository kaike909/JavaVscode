package Streams;

public class Aluno {

    final String nome;
    final double nota;
    final boolean bomComp;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean bomComp) {
        this.nome = nome;
        this.nota = nota;
        this.bomComp = bomComp;
    }

}
