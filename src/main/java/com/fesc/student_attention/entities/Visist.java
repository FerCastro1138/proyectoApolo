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
public class Visist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "folio", length = 8)
    private String folio;
    @Column(name = "next_visit")
    private LocalDateTime nextVisit;
    @Column(name = "hour")
    private LocalTime hour;
    @JoinColumn(name = "therapist_id", nullable = false)
    private int therapisId;
    @JoinColumn(name = "patient_id", nullable = false)
    private int patientID;
    @JoinColumn(name = "expedient_id", nullable = false)
    private int expedientID;
}
