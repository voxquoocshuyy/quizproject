package com.example.quizzproject.service;

import com.example.quizzproject.model.CoursesQuiz;
import java.util.List;
import java.util.Optional;

public interface CoursesQuizService {
    public List<CoursesQuiz> getAllCourses();
    public CoursesQuiz saveCourses(CoursesQuiz coursesQuiz);
    public void removeCourses(int id);
    public Optional<CoursesQuiz> getCoursesById(int id);
    public List<CoursesQuiz> getCoursesByName(String name);
}
