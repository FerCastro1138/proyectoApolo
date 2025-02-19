package com.fesc.student_attention.persistence;

import com.fesc.student_attention.entities.Role;

import java.util.Optional;

public interface RoleDAO {
    Optional<Role> findRoleByName(String name);
}
