package com.med.voll.api.controller;

import com.med.voll.api.domain.endereco.Endereco;
import com.med.voll.api.domain.medico.Especialidade;
import com.med.voll.api.domain.medico.Medico;

public record DadosDetalhamentoMedico(
        Long id,
        String nome,
        String email,
        String telefone,
        String crm,
        Especialidade especialidade,
        Endereco endereco) {

public DadosDetalhamentoMedico(Medico medico){
    this(medico.getId(), medico.getNome(), medico.getEmail(),
            medico.getCrm(), medico.getTelefone(),
            medico.getEspecialidade(), medico.getEndereco());
}

}
