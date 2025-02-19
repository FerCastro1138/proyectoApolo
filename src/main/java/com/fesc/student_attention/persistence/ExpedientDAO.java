package com.fesc.student_attention.persistence;

import com.fesc.student_attention.entities.Expedient;

import java.util.List;
import java.util.Optional;

public interface ExpedientDAO {
    List<Expedient> findAll();
    void save(Expedient expedient);
    void deleteById(int id);
    Optional<Expedient> findExpedientById(int id);
}
