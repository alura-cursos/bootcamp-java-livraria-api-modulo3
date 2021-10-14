package br.com.alura.livraria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.livraria.dto.ItemLivrariaDto;
import br.com.alura.livraria.modelo.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	@Query("select new br.com.alura.livraria.dto.ItemLivrariaDto("
			+ "a.nome, "
			+ "count(l), "
			+ "(count(l) * 1.0 / (select count(l2) * 1.0 from Livro l2))) "
			+ "from Livro l "
			+ "join l.autor a "
			+ "group by a.nome")
	List<ItemLivrariaDto> relatorioLivrosPublicadosPorAutor();

}
