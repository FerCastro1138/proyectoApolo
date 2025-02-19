package com.fesc.student_attention.persistence;

import com.fesc.student_attention.entities.Campus;

import java.util.List;
import java.util.Optional;

public interface CampusDAO {
    List<Campus> findAll();
    Optional<Campus> findCampusByName(String name);
}
