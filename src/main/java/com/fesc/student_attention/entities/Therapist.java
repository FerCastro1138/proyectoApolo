package com.fesc.student_attention.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "therapists")
@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class Therapist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 60)
    private String name;
    @Column(name = "email", length = 254)
    private String email;
    @Column(name = "password", length = 255, nullable = false)
    private String password;
    @Column(name = "area", length = 255)
    private String area;
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
    @JoinColumn(name = "status_id", nullable = false)
    private int statusId;
    @JoinColumn(name = "campus_id", nullable = false)
    private int campusId;
}
