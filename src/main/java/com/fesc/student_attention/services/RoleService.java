package com.fesc.student_attention.services;

import com.fesc.student_attention.entities.Role;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findRoleByName(String name);
}
