package com.fesc.student_attention.entities;

import com.fesc.student_attention.security.enums.RoleName;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "roles", unique = true, nullable = false)
    private RoleName roleName;
    @Column(name = "description", length = 50)
    private String description;
}
