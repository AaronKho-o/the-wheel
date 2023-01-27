package com.icafe.thewheel.thewheel.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "QUESTION")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "QUESTION_ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "SUBJECT_ID")
    private Subject questionSubject;

    @Column(name = "QUESTION_BODY", nullable = false)
    private String questionBody;

    @Column(name = "OPTION_1", nullable = false)
    private String option1;

    @Column(name = "OPTION_2", nullable = false)
    private String option2;

    @Column(name = "OPTION_3", nullable = false)
    private String option3;

    @Column(name = "OPTION_4", nullable = false)
    private String option4;

    @Column(name = "CORRECT_OPTION", nullable = false)
    private String correctOption;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXPERT_ID")
    private Expert questionExpert;

    @Column(name = "QUESTION_STATUS", nullable = false)
    private String questionStatus;

    public Question() {}

    public Question(Subject questionSubject, String questionBody, String option1, String option2, String option3, String option4, String correctOption, Expert questionExpert, String questionStatus) {
        this.questionSubject = questionSubject;
        this.questionBody = questionBody;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOption = correctOption;
        this.questionExpert = questionExpert;
        this.questionStatus = questionStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Subject getQuestionSubject() {
        return questionSubject;
    }

    public void setQuestionSubject(Subject questionSubject) {
        this.questionSubject = questionSubject;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public Expert getQuestionExpert() {
        return questionExpert;
    }

    public void setQuestionExpert(Expert questionExpert) {
        this.questionExpert = questionExpert;
    }

    public String getQuestionStatus() {
        return questionStatus;
    }

    public void setQuestionStatus(String questionStatus) {
        this.questionStatus = questionStatus;
    }
}
