package com.fesc.student_attention.repositories;

import com.fesc.student_attention.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findUserById(int id);
    List<User> findUserByName(String name);
    List<User> findUserByEmail(String email);
    List<User> findUserByGender(String gender);

}
