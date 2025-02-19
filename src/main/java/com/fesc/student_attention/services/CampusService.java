package com.fesc.student_attention.services;

import com.fesc.student_attention.entities.Campus;

import java.util.List;
import java.util.Optional;

public interface CampusService {
    List<Campus> findAll();
    Optional<Campus> findCampusByName(String name);
}
