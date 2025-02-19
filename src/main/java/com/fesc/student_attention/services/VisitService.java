package com.fesc.student_attention.services;

import com.fesc.student_attention.entities.Visit;

import java.util.List;
import java.util.Optional;

public interface VisitService {
    List<Visit> findAll();
    void save(Visit visit);
    void deteleById(int id);
    Optional<Visit> findVisitByFolio(String folio);
}
