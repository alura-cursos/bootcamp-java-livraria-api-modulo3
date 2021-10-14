package br.com.alura.livraria.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroFormDto {

	@NotBlank(message = "Título deve ser informado!")
	@Size(min = 10, max = 100, message = "Título deve ter entre 10 e 100 caracteres!")
	private String titulo;

	@NotNull(message = "Data de lançamento deve ser informada!")
	@PastOrPresent
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataLancamento;

	@NotNull(message = "Número de páginas deve ser informado!")
	@Min(value = 100, message = "Número de páginas deve ser >= 100!")
	private Integer numeroPaginas;

	@JsonAlias("autor_id")
	@NotNull(message = "Id do autor deve ser informado!")
	private Long autorId;

}
