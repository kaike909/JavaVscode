package teste.basico;

import javax.persistence.*;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 1L);
        usuario.setNome("Carlos Henrique");

        // em.merge(usuario);

        em.getTransaction().commit();

        System.out.println("Nome: " + usuario.getNome());

        em.close();
        emf.close();
    }
}
