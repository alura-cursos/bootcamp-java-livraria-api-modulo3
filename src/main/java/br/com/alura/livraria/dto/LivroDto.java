package br.com.alura.livraria.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroDto {

	private Long id;
	private String titulo;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataLancamento;
	private Integer numeroPaginas;

	private AutorDto autor;

}
