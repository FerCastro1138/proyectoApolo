package com.fesc.student_attention.persistence.Impl;

import com.fesc.student_attention.entities.Campus;
import com.fesc.student_attention.persistence.CampusDAO;
import com.fesc.student_attention.repositories.CampusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CampusDAOImpl implements CampusDAO {

    @Autowired
    private CampusRepository campusRepository;

    @Override
    public List<Campus> findAll() {
        return (List<Campus>) campusRepository.findAll();
    }

    @Override
    public Optional<Campus> findCampusByName(String name) {
        return campusRepository.findCampusByName(name);
    }
}
