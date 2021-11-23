package com.example.quizzproject.controller;

import com.example.quizzproject.model.CoursesQuiz;
import com.example.quizzproject.model.DataQuiz;
import com.example.quizzproject.repository.CoursesRepository;
import com.example.quizzproject.service.CoursesQuizService;
import com.example.quizzproject.service.DataQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
    @Autowired
    private DataQuizService dataQuizService;
    @Autowired
    private CoursesQuizService coursesQuizService;
    @PostMapping("/addCourse")
    public ResponseEntity<?> addCourses(@RequestBody CoursesQuiz coursesQuiz) {
        return new ResponseEntity<>(coursesQuizService.saveCourses(coursesQuiz), HttpStatus.CREATED);
    }

    @GetMapping("/course")
    public List<CoursesQuiz> getAllCourse() {
        return coursesQuizService.getAllCourses();
    }

    @GetMapping("/courses/{name}")

    public List<CoursesQuiz> getCourseByName(@RequestParam String name){
        if(name!=null) {
            return coursesQuizService.getCoursesByName(name);
        }else {
            return coursesQuizService.getAllCourses();
        }
    }

    @GetMapping("/course/{id}")
    public List<DataQuiz> getAllQuestionById(@PathVariable int id) {
        return dataQuizService.getAllQuestionByCoursesId(id);
    }
    @DeleteMapping("/deleteCourse/{id}")
    public String deleteCourse(@PathVariable int id) {
        coursesQuizService.removeCourses(id);
        return "course id : " + id + " is deleted";
    }

    @PutMapping("/updateCourse/{id}")
    public CoursesQuiz updateCourse(@PathVariable int id,@RequestBody CoursesQuiz coursesQuiz) {
        return coursesQuizService.saveCourses(coursesQuiz);
    }

    @GetMapping("/question")
    public List<DataQuiz> getAllQuestion() {
        return dataQuizService.getAllQuestion();
    }

    @GetMapping("/question/{id}")
    public Optional<DataQuiz> getQuestionById(@PathVariable int id){
        return dataQuizService.getQuestionById(id);
    }

    @PostMapping("/addQuestion")
    public ResponseEntity<?> add(@RequestBody DataQuiz dataQuiz) {
        return new ResponseEntity<>(dataQuizService.saveQuestion(dataQuiz), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteQuestion/{id}")
    public String deleteQuestion(@PathVariable int id) {
        dataQuizService.removeQuestion(id);
        return "question id : " + id + " is deleted";
    }

    @PutMapping("/updateQuestion/{id}")
    public DataQuiz updateQuestion(@PathVariable int id, @RequestBody DataQuiz dataQuiz) {
        return dataQuizService.saveQuestion(dataQuiz);
    }

}
