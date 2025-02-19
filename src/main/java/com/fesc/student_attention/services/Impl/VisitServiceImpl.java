package com.fesc.student_attention.services.Impl;

import com.fesc.student_attention.entities.Visit;
import com.fesc.student_attention.persistence.VisitDAO;
import com.fesc.student_attention.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitServiceImpl implements VisitService {

    @Autowired
    private VisitDAO visitDAO;

    @Override
    public List<Visit> findAll() {
        return visitDAO.findAll();
    }

    @Override
    public void save(Visit visit) {
        visitDAO.save(visit);
    }

    @Override
    public void deteleById(int id) {
        visitDAO.deteleById(id);
    }

    @Override
    public Optional<Visit> findVisitByFolio(String folio) {
        return visitDAO.findVisitByFolio(folio);
    }
}
