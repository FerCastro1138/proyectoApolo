package com.fesc.student_attention.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PriorityRepository extends CrudRepository<Priority, Integer> {
    Optional<Priority> findPriorityByName(String name);
}
