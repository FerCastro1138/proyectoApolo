package com.fesc.student_attention.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CampusRepository extends CrudRepository<Campus, Integer> {
    Optional<Campus> findCampusByName(String name);
}
