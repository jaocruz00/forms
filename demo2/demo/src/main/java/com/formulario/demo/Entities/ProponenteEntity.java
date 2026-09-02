package com.formulario.demo.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProponenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idProponente;
    private String nome;

@OneToMany(mappedBy = "proponente")
private List<CandidatoEntity> candidato;

}
