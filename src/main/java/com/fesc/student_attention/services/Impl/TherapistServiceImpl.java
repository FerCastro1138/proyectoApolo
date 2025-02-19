package com.fesc.student_attention.services.Impl;

import com.fesc.student_attention.entities.Therapist;
import com.fesc.student_attention.entities.User;
import com.fesc.student_attention.persistence.TherapistDAO;
import com.fesc.student_attention.services.TherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TherapistServiceImpl implements TherapistService {

    @Autowired
    private TherapistDAO therapistDAO;


    @Override
    public List<Therapist> findAll() {
        return therapistDAO.findAll();
    }

    @Override
    public void save(Therapist therapist) {
        therapistDAO.save(therapist);
    }

    @Override
    public void deleteById(int id) {
        therapistDAO.deleteById(id);
    }

    @Override
    public Optional<Therapist> findTherapistById(Integer id) {
        return therapistDAO.findTherapistById(id);
    }

    @Override
    public Optional<Therapist> findTherapistByName(String name) {
        return therapistDAO.findTherapistByName(name);
    }

    @Override
    public List<Therapist> findTherapistByEmail(String email) {
        return therapistDAO.findTherapistByEmail(email);
    }
}
