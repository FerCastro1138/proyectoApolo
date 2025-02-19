package com.fesc.student_attention.services.Impl;

import com.fesc.student_attention.entities.Priority;
import com.fesc.student_attention.persistence.PriorityDAO;
import com.fesc.student_attention.services.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PriorityServiceImpl implements PriorityService {

    @Autowired
    private PriorityDAO priorityDAO;

    @Override
    public Optional<Priority> findPriorityByName(String name) {
        return priorityDAO.findPriorityByName(name);
    }
}
