package teste.basico;

import javax.persistence.*;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 1L);
        usuario.setNome("Carlos Henrique");
        usuario.setEmail("carlosHenrique@lanche.com.br");

        em.merge(usuario);

        System.out.println("Nome: " + usuario.getNome() + " - Email: " + usuario.getEmail());

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
