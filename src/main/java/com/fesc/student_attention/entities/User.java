package com.fesc.student_attention.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "users")
@Getter @Setter
@EqualsAndHashCode @ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "first_name", length = 29)
    private String firstName;
    @Column(name = "middle_name", length = 29)
    private String middleName;
    @Column(name = "last_name", length = 29)
    private String lastName;
    @Column(name = "second_last_name", length = 29)
    private String secondLastName;
    @Column(name = "email", length = 254)
    private String email;
    @Column(name = "password", length = 64)
    private char password;
    @Column(name = "address", length = 100)
    private String address;
    @Column(name = "gender", length = 10)
    private String gender;
    @Column(name = "date_of_birth", columnDefinition = "DATE")
    private LocalDate dateOfBirth;
    @Column(name = "number" , length = 10)
    private String number;
    @Column(name = "status_id")
    private int statusId;
    @Column(name = "role_id")
    private int roleId;
    @Column(name = "campus_id")
    private int campusId;
}
