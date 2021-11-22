package com.example.quizzproject.repository;
import com.example.quizzproject.model.DataQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DataQuizRepository extends JpaRepository<DataQuiz, Integer> {
    List<DataQuiz> findAllQuestionByCoursesQuiz_Id(int id);
}
