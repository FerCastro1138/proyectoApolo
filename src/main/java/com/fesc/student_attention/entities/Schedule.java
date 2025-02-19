package com.fesc.student_attention.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "schedules")
@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "day_of_week", length = 15, nullable = false)
    private String dayOfWeek;
    @Column(name = "sart_hour", length = 10, nullable = false)
    private String startHour;
    @Column(name = "finish_hour", length = 10, nullable = false)
    private String finishHour;
    @Column(name = "availability", nullable = false)
    private boolean availability;

    @ManyToOne
    @JoinColumn(name = "therapist_id", nullable = false)
    private Therapist therapist;
}
