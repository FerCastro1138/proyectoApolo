package com.fesc.student_attention.persistence.Impl;

import com.fesc.student_attention.entities.Role;
import com.fesc.student_attention.persistence.RoleDAO;
import com.fesc.student_attention.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RoleDAOImpl implements RoleDAO {

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Optional<Role> findRoleByName(String name) {
        return roleRepository.findRoleByName(name);
    }
}
