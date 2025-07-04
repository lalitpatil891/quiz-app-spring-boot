package com.exam.quizapp.service;

import com.exam.quizapp.Question;
import com.exam.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
           return questionDao.findAll();
    }
}
