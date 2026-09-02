package com.formulario.demo.Repositories;

import com.formulario.demo.Entities.CandidatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<CandidatoEntity, Long> {
}
