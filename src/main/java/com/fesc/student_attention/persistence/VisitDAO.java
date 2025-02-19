package com.fesc.student_attention.persistence;

import com.fesc.student_attention.entities.Visit;

import java.util.List;
import java.util.Optional;

public interface VisitDAO {
    List<Visit> findAll();
    void save(Visit visit);
    void deteleById(int id);
    Optional<Visit> findVisitByFolio(String folio);
}
