package com.fesc.student_attention.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "visits")
@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "folio", length = 8, nullable = false, unique = true)
    private String folio;
    @Column(name = "next_visit", nullable = true)
    private LocalDateTime nextVisit;
    @Column(name = "hour", nullable = true)
    private LocalTime hour;

    @ManyToOne
    @JoinColumn(name = "therapist_id", nullable = false)
    private Therapist therapist;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "expedient_id", nullable = false)
    private Expedient expedient;
}
