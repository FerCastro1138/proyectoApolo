package com.fesc.student_attention.services.Impl;

import com.fesc.student_attention.entities.Expedient;
import com.fesc.student_attention.persistence.ExpedientDAO;
import com.fesc.student_attention.services.ExpedientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpedientServiceImpl implements ExpedientService {

    @Autowired
    private ExpedientDAO expedientDAO;

    @Override
    public List<Expedient> findAll() {
        return expedientDAO.findAll();
    }

    @Override
    public void save(Expedient expedient) {
        expedientDAO.save(expedient);
    }

    @Override
    public void deleteById(int id) {
        expedientDAO.deleteById(id);
    }

    @Override
    public Optional<Expedient> findExpedientById(int id) {
        return expedientDAO.findExpedientById(id);
    }
}
