package com.fesc.student_attention.persistence.Impl;

import com.fesc.student_attention.entities.Priority;
import com.fesc.student_attention.persistence.PriorityDAO;
import com.fesc.student_attention.repositories.PriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PriorityDAOImpl implements PriorityDAO {

    @Autowired
    private PriorityRepository priorityRepository;

    @Override
    public List<Priority> findAll() {
        return (List<Priority>) priorityRepository.findAll();
    }

    @Override
    public Optional<Priority> findPriorityByName(String name) {
        return priorityRepository.findPriorityByName(name);
    }
}
