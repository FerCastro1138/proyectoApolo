package com.fesc.student_attention.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "priorities")
@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 15, nullable = false)
    private String name;
    @Column(name = "description", length = 50)
    private String description;
}
