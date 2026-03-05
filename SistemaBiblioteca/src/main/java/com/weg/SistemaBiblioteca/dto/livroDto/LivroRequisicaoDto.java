package com.weg.SistemaBiblioteca.dto.livroDto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record LivroRequisicaoDto(
        @NotBlank(message = "Erro: o título não pode ficar vazio")
        String titulo,

        @NotBlank(message = "Erro: o nome do autor não pode ficar vazio")
        String autor,

        @Positive(message = "Erro: o ano de publicação deve ser positivo")
        @Max(value = 2026, message = "Erro: o ano de publicação não pode ser maior que 2026")
        @NotNull(message = "Erro: o ano de publicação não pode ficar vazio")
        int anoPublicacao
) {
}
