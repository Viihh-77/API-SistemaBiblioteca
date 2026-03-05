package com.weg.SistemaBiblioteca.dto.emprestimoDto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record EmprestimoRequisicaoDto(
        long livroId,
        long usuarioId,

        @PastOrPresent(message = "Erro: a data de empréstimo não pode ser no futuro")
        @NotNull(message = "Erro: a data de empréstimo não pode estar vazia")
        LocalDate dataEmprestimo,

        @FutureOrPresent(message = "Erro: a data de devolução não pode ser no passado")
        @NotNull(message = "Erro: a data de devolução não pode estar vazia")
        LocalDate dataDevolucao
) {
}
