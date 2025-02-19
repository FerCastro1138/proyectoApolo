package com.fesc.student_attention.persistence.Impl;

import com.fesc.student_attention.entities.Visit;
import com.fesc.student_attention.persistence.VisitDAO;
import com.fesc.student_attention.repositories.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VisitDAOImpl implements VisitDAO {

    @Autowired
    private VisitRepository visitRepository;

    @Override
    public List<Visit> findAll() {
        return (List<Visit>) visitRepository.findAll();
    }

    @Override
    public void save(Visit visit) {
        visitRepository.save(visit);
    }

    @Override
    public void deteleById(int id) {
        visitRepository.deleteById(id);
    }

    @Override
    public Optional<Visit> findVisitByFolio(String folio) {
        return visitRepository.findVisitByFolio(folio);
    }
}
