package com.example.quizzproject.repository;

import com.example.quizzproject.model.CoursesQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CoursesRepository extends JpaRepository<CoursesQuiz, Integer> {
    List<CoursesQuiz> getCoursesQuizByNameContains(String name);
}
