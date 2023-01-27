package com.icafe.thewheel.thewheel.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "EXPERT")
public class Expert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EXPERT_ID")
    private Integer id;

    @Column(name = "EXPERT_NAME", nullable = false)
    private String expertName;

    @Column(name = "EXPERT_SUBJECT", nullable = false)
    private String expertSubject;

    @Column(name = "EXPERT_STATUS", nullable = false)
    private String expertStatus;

    @OneToMany(mappedBy = "questionExpert", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Question> questions = new ArrayList<>();

    public Expert() {}

    public Expert(String expertName, String expertSubject, String expertStatus) {
        this.expertName = expertName;
        this.expertSubject = expertSubject;
        this.expertStatus = expertStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public String getExpertSubject() {
        return expertSubject;
    }

    public void setExpertSubject(String expertSubject) {
        this.expertSubject = expertSubject;
    }

    public String getExpertStatus() {
        return expertStatus;
    }

    public void setExpertStatus(String expertStatus) {
        this.expertStatus = expertStatus;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
        question.setQuestionExpert(this);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
        question.setQuestionExpert(null);
    }

}
