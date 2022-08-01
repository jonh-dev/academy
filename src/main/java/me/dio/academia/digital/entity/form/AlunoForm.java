package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preencha o campo com o seu nome.")
  @Size(min = 3, max = 50, message = "$'{validateValue}' precisa ter entre {min} e {max} caracteres.")
  private String nome;

  @NotBlank(message = "Preencha o campo com o seu CPF.")
  @CPF(message = "'{validateValue}' é inválido.")
  private String cpf;

  @NotBlank(message = "Preencha o campo com o seu bairro.")
  @Size(min = 3, max = 50, message = "$'{validateValue}' precisa ter entre {min} e {max} caracteres.")
  private String bairro;

  @NotNull(message = "Preencha o campo com sua data de nascimento.")
  @Past(message = "Data '{validateValue}' é inválida.")
  private LocalDate dataDeNascimento;
}
