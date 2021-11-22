package com.example.quizzproject.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CoursesQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Courses_Id")
    private int id;
    private String name;
    private String image;
    public CoursesQuiz() {
    }

    public CoursesQuiz(int id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
