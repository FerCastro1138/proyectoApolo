package com.fesc.student_attention.repositories;

import com.fesc.student_attention.entities.Therapist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.invoke.CallSite;
import java.util.List;
import java.util.Optional;

@Repository
public interface TherapistRepository extends CrudRepository<Therapist, Integer> {

    Optional<Therapist> findTherapistById(Integer id);
    Optional<Therapist> findTherapistByName(String name);
    List<Therapist> findTherapistByEmail(String email);

}
