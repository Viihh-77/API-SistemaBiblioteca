package com.weg.SistemaBiblioteca.dto.usuarioDto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioRequisicaoDto(
        @NotBlank(message = "Erro: o campo 'nome' não pode ficar vazio")
        String nome,

        @Email(message = "Erro: o email informado é inválido")
        String email
) {
}
