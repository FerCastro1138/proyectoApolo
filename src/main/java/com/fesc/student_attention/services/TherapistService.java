package com.fesc.student_attention.services;

import com.fesc.student_attention.entities.Therapist;

import java.util.List;
import java.util.Optional;

public interface TherapistService {
    List<Therapist> findAll();
    void save(Therapist therapist);
    void deleteById(int id);
    Optional<Therapist> findTherapistById(Integer id);
    Optional<Therapist> findTherapistByName(String name);
    List<Therapist> findTherapistByEmail(String email);
}
