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
    @Column(name = "day_of_week", length = 15)
    private String dayOfWeek;
    @Column(name = "sart_hour", length = 10)
    private String startHour;
    @Column(name = "finish_hour", length = 10)
    private String finishHour;
    @Column(name = "abailavility")
    private boolean abailavility;
    @JoinColumn(name = "therapist_id", nullable = false)
    private int therapistId;
}
