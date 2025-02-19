package com.fesc.student_attention.services.Impl;

import com.fesc.student_attention.entities.Role;
import com.fesc.student_attention.persistence.RoleDAO;
import com.fesc.student_attention.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDAO roleDAO;

    @Override
    public Optional<Role> findRoleByName(String name) {
        return roleDAO.findRoleByName(name);
    }
}
