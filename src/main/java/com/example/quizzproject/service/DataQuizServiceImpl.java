package com.example.quizzproject.service;

import com.example.quizzproject.model.DataQuiz;
import com.example.quizzproject.repository.DataQuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataQuizServiceImpl implements DataQuizService {
    @Autowired
    private DataQuizRepository dataQuizRepository;

    @Override
    public List<DataQuiz> getAllQuestion() {
        return dataQuizRepository.findAll();
    }

    @Override
    public DataQuiz saveQuestion(DataQuiz dataQuiz) {
        return dataQuizRepository.save(dataQuiz);
    }

    @Override
    public void removeQuestion(int id) {
        dataQuizRepository.deleteById(id);
    }
    @Override
    public Optional<DataQuiz> getQuestionById(int id){
        return dataQuizRepository.findById(id);
    }
    @Override
    public List<DataQuiz> getAllQuestionByCoursesId(int id){
        return dataQuizRepository.findAllQuestionByCoursesQuiz_Id(id);
    }
}
