package com.formulario.demo;

import java.time.LocalDate;

public record DtoDadosdoFormulario(
        // Dados Pessoais
        String nome,
        LocalDate dataNascimento,
        String rg,
        String cpf,
        String telefone,
        String email,
        String endereco,
        String numero,
        String bairro,
        String cep,
        String grauEscolaridade,
        String escola,
        String trabalho,
        String religiao,
        String redeSocial,

        // Dados do Responsável
        String nomeResponsavel,
        String parentescoResponsavel,
        String telefoneResponsavel,
        String trabalhoResponsavel,
        String emailResponsavel,
        Boolean responsavelTioMacom,
        String lojaMaconicaResponsavel
) {
}
