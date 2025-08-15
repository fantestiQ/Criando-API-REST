package com.med.voll.api.controller;

import com.med.voll.api.medico.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(@NotNull
                                     Long id,
                                     String telefone,
                                     String nome,
                                     DadosEndereco endereco) {
}
