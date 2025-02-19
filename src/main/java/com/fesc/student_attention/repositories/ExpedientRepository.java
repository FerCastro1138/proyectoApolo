package com.fesc.student_attention.repositories;

import com.fesc.student_attention.entities.Expedient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ExpedientRepository extends CrudRepository<Expedient, Integer> {
    Optional<Expedient> findExpedientById(int id);

}
