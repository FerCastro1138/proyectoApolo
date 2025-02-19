package com.fesc.student_attention.services;

import com.fesc.student_attention.entities.Priority;

import java.util.Optional;

public interface PriorityService {
    Optional<Priority> findPriorityByName(String name);
}
