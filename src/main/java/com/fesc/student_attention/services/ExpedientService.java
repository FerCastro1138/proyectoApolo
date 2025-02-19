package com.fesc.student_attention.services;

import com.fesc.student_attention.entities.Expedient;

import java.util.List;
import java.util.Optional;

public interface ExpedientService {
    List<Expedient> findAll();
    void save(Expedient expedient);
    void deleteById(int id);
    Optional<Expedient> findExpedientById(int id);
}
