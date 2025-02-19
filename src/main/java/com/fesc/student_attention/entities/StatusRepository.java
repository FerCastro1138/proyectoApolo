package com.fesc.student_attention.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StatusRepository extends CrudRepository<Status, Integer> {
    Optional<Status> findStatusByName(String name);
}
