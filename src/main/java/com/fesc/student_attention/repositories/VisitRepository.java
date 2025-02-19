package com.fesc.student_attention.repositories;

import com.fesc.student_attention.entities.Visit;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Integer> {
    Optional<Visit> findVisitByFolio(String folio);
}
