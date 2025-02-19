package com.fesc.student_attention.persistence.Impl;

import com.fesc.student_attention.entities.Therapist;
import com.fesc.student_attention.persistence.TherapistDAO;
import com.fesc.student_attention.repositories.TherapistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TherapistDAOImpl implements TherapistDAO {

    @Autowired
    private TherapistRepository therapistRepository;

    @Override
    public List<Therapist> findAll() {
        return (List<Therapist>) therapistRepository.findAll();
    }

    @Override
    public void save(Therapist therapist) {
        therapistRepository.save(therapist);
    }

    @Override
    public void deleteById(int id) {
        therapistRepository.deleteById(id);
    }

    @Override
    public Optional<Therapist> findTherapistById(Integer id) {
        return therapistRepository.findTherapistById(id);
    }

    @Override
    public Optional<Therapist> findTherapistByName(String name) {
        return therapistRepository.findTherapistByName(name);
    }

    @Override
    public List<Therapist> findTherapistByEmail(String email) {
        return therapistRepository.findTherapistByEmail(email);
    }
}
