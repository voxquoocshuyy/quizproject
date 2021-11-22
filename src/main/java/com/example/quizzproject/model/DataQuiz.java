package com.example.quizzproject.model;

import javax.persistence.*;

@Entity
public class DataQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correct_Answer;
    private String image;
    private float point;
    @ManyToOne
    @JoinColumn(name = "Courses_Id", referencedColumnName = "Courses_Id")
    private CoursesQuiz coursesQuiz;

    public DataQuiz() {
    }

    public DataQuiz(int id, String question, String answerA, String answerB, String answerC, String answerD, String correct_Answer, String image, float point, CoursesQuiz coursesQuiz) {
        this.id = id;
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correct_Answer = correct_Answer;
        this.image = image;
        this.point = point;
        this.coursesQuiz = coursesQuiz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getCorrect_Answer() {
        return correct_Answer;
    }

    public void setCorrect_Answer(String correct_Answer) {
        this.correct_Answer = correct_Answer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public CoursesQuiz getCoursesQuiz() {
        return coursesQuiz;
    }

    public void setCoursesQuiz(CoursesQuiz coursesQuiz) {
        this.coursesQuiz = coursesQuiz;
    }
}



