package com.formulario.demo.Entities;

import com.formulario.demo.DtoDadosdoFormulario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CandidatoEntity {
    // Dados Pessoais
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String rg;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private String numero;
    private String bairro;
    private String cep;
    private String grauEscolaridade;
    private String escola;
    private String trabalho;
    private String religiao;
    private String redeSocial;

    private String nomeResponsavel1;
    private String parentescoResponsavel1;
    private String telefoneResponsavel1;
    private String trabalhoResponsavel1;
    private String emailResponsavel1;
    private Boolean responsavelTioMacom1;
    private String lojaMaconicaResponsavel1;

    @ManyToOne
    @JoinColumn(name  =  "proponente_id")
    private ProponenteEntity proponente;

    public CandidatoEntity(DtoDadosdoFormulario dadosDoFormulario) {
        this.nome  = dadosDoFormulario.nome();
        this.dataNascimento  = dadosDoFormulario.dataNascimento();
        this.rg  = dadosDoFormulario.rg();
        this.cpf  = dadosDoFormulario.cpf();
        this.telefone  = dadosDoFormulario.telefone();
        this.email  = dadosDoFormulario.email();
        this.endereco  = dadosDoFormulario.endereco();
        this.numero  = dadosDoFormulario.numero();
        this.bairro  = dadosDoFormulario.bairro();
        this.cep  = dadosDoFormulario.cep();
        this.grauEscolaridade  = dadosDoFormulario.grauEscolaridade();
        this.escola  = dadosDoFormulario.escola();
        this.trabalho  = dadosDoFormulario.trabalho();
        this.religiao  = dadosDoFormulario.religiao();
        this.redeSocial  = dadosDoFormulario.redeSocial();
//        this.nomeResponsavel1  = dadosDoFormulario.nomeResponsavel1();
//        this.parentescoResponsavel1  = dadosDoFormulario. parentescoResponsavel1;
//        this.telefoneResponsavel1  = dadosDoFormulario. telefoneResponsavel1;
//        this.trabalhoResponsavel1  = dadosDoFormulario. trabalhoResponsavel1;
//        this.emailResponsavel1  = dadosDoFormulario. emailResponsavel1;
//        this.responsavelTioMacom1  = dadosDoFormulario. responsavelTioMacom1;
//        this.lojaMaconicaResponsavel1  = dadosDoFormulario. lojaMaconicaResponsavel1;
//        this.proponente  = dadosDoFormulario. proponente;
    }
}
