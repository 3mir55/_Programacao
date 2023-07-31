package br.com.essyx.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.essyx.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

	public Iterable<Produto> findByNomeContainingIgnoreCase (String parteNome);
	
//	findByNomeContaining
//	findByNomeIsContaining
//	findByNomeContains
//	
//	findByNomeStartWith
//	findByNomeEndsWith
//	
//	findByNomeNotContaining
//	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%") public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
	
}
