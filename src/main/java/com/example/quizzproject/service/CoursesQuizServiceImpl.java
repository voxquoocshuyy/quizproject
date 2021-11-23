package com.example.quizzproject.service;

import com.example.quizzproject.model.CoursesQuiz;
import com.example.quizzproject.model.DataQuiz;
import com.example.quizzproject.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesQuizServiceImpl implements CoursesQuizService{
    @Autowired
    private CoursesRepository coursesRepository;
    @Override
    public List<CoursesQuiz> getAllCourses(){
        return coursesRepository.findAll();
    }
    @Override
    public CoursesQuiz saveCourses(CoursesQuiz coursesQuiz) {
        return coursesRepository.save(coursesQuiz);
    }

    @Override
    public void removeCourses(int id) {
        coursesRepository.deleteById(id);
    }
    @Override
    public Optional<CoursesQuiz> getCoursesById(int id){
        return coursesRepository.findById(id);
    }
    @Override
    public List<CoursesQuiz> getCoursesByName(String name){
        return coursesRepository.getCoursesQuizByNameContains(name);
    }
}
