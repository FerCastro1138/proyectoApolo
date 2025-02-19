package com.fesc.student_attention.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter @Setter
@EqualsAndHashCode @ToString
@NoArgsConstructor @AllArgsConstructor
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
    @Column(name = "password", length = 255, nullable = false)
    private String password;
    @Column(name = "address", length = 100)
    private String address;
    @Column(name = "gender", length = 10)
    private String gender;
    @Column(name = "date_of_birth", columnDefinition = "DATE")
    private LocalDate dateOfBirth;
    @Column(name = "number" , length = 10)
    private String number;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Campus campus;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Visist> visistList = new ArrayList<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Expedient> expedientList = new ArrayList<>();
}
