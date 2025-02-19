package com.fesc.student_attention.services.Impl;

import com.fesc.student_attention.entities.Status;
import com.fesc.student_attention.persistence.StatusDAO;
import com.fesc.student_attention.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusDAO statusDAO;

    @Override
    public List<Status> findAll() {
        return statusDAO.findAll();
    }

    @Override
    public void save(Status status) {
        statusDAO.save(status);
    }

    @Override
    public void deleteById(int id) {
        statusDAO.deleteById(id);
    }

    @Override
    public Optional<Status> findStatusByName(String name) {
        return statusDAO.findStatusByName(name);
    }
}
