package com.example.quizzproject.service;

import com.example.quizzproject.model.DataQuiz;
import java.util.List;
import java.util.Optional;

public interface DataQuizService {
    public List<DataQuiz> getAllQuestion();
    public DataQuiz saveQuestion(DataQuiz dataQuiz);
    public void removeQuestion(int id);
    public Optional<DataQuiz> getQuestionById(int id);
    public List<DataQuiz> getAllQuestionByCoursesId(int id);
}
