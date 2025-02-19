package com.fesc.student_attention.persistence;

import com.fesc.student_attention.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {
    List<User> findAll();
    void save(User user);
    void deleteById(int id);
    Optional<User> findUserById(int id);
    List<User> findUserByName(String name);
    List<User> findUserByEmail(String email);
    List<User> findUserByGender(String gender);
}
