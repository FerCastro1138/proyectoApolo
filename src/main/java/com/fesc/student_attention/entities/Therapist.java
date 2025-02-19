package com.fesc.student_attention.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "therapists")
@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class Therapist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 60, nullable = false)
    private String name;
    @Column(name = "email", length = 254, nullable = false)
    private String email;
    @Column(name = "password", length = 255, nullable = false)
    private String password;
    @Column(name = "area", length = 255)
    private String area;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;
    @ManyToMany
    @JoinTable(name = "therapists_campus", joinColumns = @JoinColumn(name = "therapist_id"),
            inverseJoinColumns = @JoinColumn(name = "campus_id"))
    private List<Campus> campusList = new ArrayList<>();
    @OneToMany(mappedBy = "therapist", orphanRemoval = true)
    private List<Schedule> scheduleList = new ArrayList<>();
}
