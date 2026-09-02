package com.formulario.demo;

import com.formulario.demo.Entities.CandidatoEntity;
import com.formulario.demo.Repositories.CandidatoRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
@AllArgsConstructor
public class SistemaService {

  CandidatoRepository candidatoRepository;

    public boolean salvardados (DtoDadosdoFormulario  joaquin){

        try {
            CandidatoEntity candidato = new CandidatoEntity(joaquin);

            CandidatoEntity candidatoSalvo = candidatoRepository.save(candidato);

            System.out.println("candidatoSalvo");
            System.out.println(candidatoSalvo);

            return true;
        }catch (Exception e){

            System.out.println("Erro ao salvar o candidato");
            return false;
        }
    }
}
