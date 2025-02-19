package com.fesc.student_attention.persistence.Impl;

import com.fesc.student_attention.entities.Status;
import com.fesc.student_attention.persistence.StatusDAO;
import com.fesc.student_attention.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StatusDAOImpl implements StatusDAO {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public List<Status> findAll() {
        return statusRepository.findAll();
    }

    @Override
    public void save(Status status) {
        statusRepository.save(status);
    }

    @Override
    public void deleteById(int id) {
        statusRepository.deleteById(id);
    }

    @Override
    public Optional<Status> findStatusByName(String name) {
        return statusRepository.findStatusByName(name);
    }
}
