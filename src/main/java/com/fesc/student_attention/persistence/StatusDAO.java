package com.fesc.student_attention.persistence;

import com.fesc.student_attention.entities.Status;

import java.util.List;
import java.util.Optional;

public interface StatusDAO {
    List<Status> findAll();
    void save(Status status);
    void deleteById(int id);
    Optional<Status> findStatusByName(String name);
}
