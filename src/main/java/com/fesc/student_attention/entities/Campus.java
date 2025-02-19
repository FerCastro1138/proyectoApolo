package com.fesc.student_attention.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "campus")
@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor  @AllArgsConstructor
public class Campus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 25)
    private String nombre;

    @ManyToMany(mappedBy = "campusList")
    private List<Therapist> therapistList = new ArrayList<>();
}
