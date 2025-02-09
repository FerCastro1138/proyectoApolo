package com.fesc.student_attention.entities;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import java.util.Map;

@Entity
@Table(name = "expedients")
@Getter @Setter
@ToString @EqualsAndHashCode
public class Expedients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "folio", length = 8)
    private String folio;
    @Type(JsonType.class)
    @Column(name = "form_answers", columnDefinition = "json")
    private Map<String, Object> formAnswers;
    private int patientID;
    private int priorityId;
}
