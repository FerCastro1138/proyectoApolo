package com.fesc.student_attention.services.Impl;

import com.fesc.student_attention.entities.Campus;
import com.fesc.student_attention.persistence.CampusDAO;
import com.fesc.student_attention.services.CampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampusServiceImpl implements CampusService {
    @Autowired
    private CampusDAO campusDAO;


    @Override
    public List<Campus> findAll() {
        return campusDAO.findAll();
    }

    @Override
    public Optional<Campus> findCampusByName(String name) {
        return campusDAO.findCampusByName(name);
    }
}
