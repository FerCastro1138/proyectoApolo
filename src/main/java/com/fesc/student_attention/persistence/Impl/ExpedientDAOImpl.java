package com.fesc.student_attention.persistence.Impl;

import com.fesc.student_attention.entities.Expedient;
import com.fesc.student_attention.persistence.ExpedientDAO;
import com.fesc.student_attention.repositories.ExpedientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ExpedientDAOImpl implements ExpedientDAO {

    @Autowired
    private ExpedientRepository expedientRepository;
    @Override
    public List<Expedient> findAll() {
        return (List<Expedient>) expedientRepository.findAll();
    }

    @Override
    public void save(Expedient expedient) {
        expedientRepository.save(expedient);
    }

    @Override
    public void deleteById(int id) {
        expedientRepository.deleteById(id);
    }

    @Override
    public Optional<Expedient> findExpedientById(int id) {
        return expedientRepository.findExpedientById(id);
    }
}
