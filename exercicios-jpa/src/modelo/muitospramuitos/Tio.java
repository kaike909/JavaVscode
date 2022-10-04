package modelo.muitospramuitos;

import java.util.*;

import javax.persistence.*;

@Entity
public class Tio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    private List<Sobrinho> sobrinhos = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Sobrinho> getSobrinhos() {
        return sobrinhos;
    }

    public void setSobrinhos(List<Sobrinho> sobrinhos) {
        this.sobrinhos = sobrinhos;
    }

    public Tio() {
    }

    public Tio(String nome) {
        this.nome = nome;
    }

}
