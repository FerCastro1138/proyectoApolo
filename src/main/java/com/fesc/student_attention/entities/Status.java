package com.fesc.student_attention.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "status")
@Getter @Setter
@ToString @EqualsAndHashCode
@RequiredArgsConstructor
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 10)
    private String name;
    @Column(name = "description", length = 50)
    private String description;
}
