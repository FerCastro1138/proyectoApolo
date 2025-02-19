package com.fesc.student_attention.entities;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ExpedientRepository extends CrudRepository<Expedient, Integer> {
    Optional<Expedient> findExpedientById();

}
