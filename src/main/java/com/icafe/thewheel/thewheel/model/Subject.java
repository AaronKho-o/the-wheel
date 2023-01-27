package com.icafe.thewheel.thewheel.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SUBJECT")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SUBJECT_ID")
    private Integer id;

    @Column(name = "SUBJECT_NAME", nullable = false)
    private String subjectName;

    @Column(name = "SUBJECT_STATUS", nullable = false)
    private String subjectStatus;

    @OneToMany(mappedBy = "questionSubject", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Question> questions = new ArrayList<>();

    public Subject() {}

    public Subject(String subjectName, String subjectStatus) {
        this.subjectName = subjectName;
        this.subjectStatus = subjectStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
