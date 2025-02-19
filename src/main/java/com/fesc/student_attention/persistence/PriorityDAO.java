package com.fesc.student_attention.persistence;

import com.fesc.student_attention.entities.Priority;

import java.util.List;
import java.util.Optional;

public interface PriorityDAO {
    List<Priority> findAll();
    Optional<Priority> findPriorityByName(String name);
}
