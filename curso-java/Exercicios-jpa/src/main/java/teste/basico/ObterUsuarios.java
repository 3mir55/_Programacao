package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);		
		
		List<Usuario> usuarios = query.getResultList();
		
	 /* A linha abaixo substitui as 4 linhas anteriores, não foi feita dessa forma para manter a variavel jpql
	  * List<Usuario> usuarios = em.createQuery("select u from Usuario u", Usuario.class).setMaxResults(5).getResultList();
	  */
		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId() + " E-mail: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
	}
}
