package com.example.quizzproject.repository;

import com.example.quizzproject.model.CoursesQuiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<CoursesQuiz, Integer> {
}
