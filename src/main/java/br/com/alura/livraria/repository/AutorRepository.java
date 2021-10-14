package br.com.alura.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.livraria.modelo.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
