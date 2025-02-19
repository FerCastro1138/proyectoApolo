package com.fesc.student_attention.entities;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "expedients")
@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class Expedient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "folio", length = 8, nullable = false, unique = true)
    private String folio;
    @Type(JsonType.class)
    @Column(name = "form_answers", columnDefinition = "json", nullable = false)
    private Map<String, Object> formAnswers;
    @Column(name = "average", nullable = false)
    private int average;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "prioirty_id", nullable = false)
    private Priority priority;
    @OneToMany(mappedBy = "expedient", orphanRemoval = true)
    private List<Visit> visitList = new ArrayList<>();
}
