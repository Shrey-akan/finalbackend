package com.jobsite.oragejobsite.config.service;

import java.util.List;

import com.jobsite.oragejobsite.entity.QuizQuestion;

public interface QuizQuestionService {
    List<QuizQuestion> getAllQuizQuestions();
    QuizQuestion getQuizQuestionById(Long id);
    QuizQuestion saveQuizQuestion(QuizQuestion quizQuestion);
    void deleteQuizQuestion(Long id);
}