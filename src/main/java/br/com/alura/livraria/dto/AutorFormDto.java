package br.com.alura.livraria.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorFormDto {

	@NotBlank(message = "Nome deve ser informado!")
	private String nome;

	@NotBlank(message = "Email deve ser informado!")
	@Email(message = "Email no formato inválido!")
	private String email;

	@NotNull(message = "Data de nascimento deve ser informada!")
	@PastOrPresent(message = "Data de nascimento deve ser menor ou igual a hoje!")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;

	@NotBlank(message = "Mini currículo deve ser informado!")
	private String miniCurriculo;

}
