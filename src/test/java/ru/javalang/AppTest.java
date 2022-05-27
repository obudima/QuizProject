package ru.javalang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void allRight()
    {
        Quiz quiz = new Quiz();
        Question[] questions = new Question[5];
        questions = new Question[5];
        for (int i = 0; i < questions.length; i++) {

            questions[i] = new Question();
            questions[i].setQuestionId(i);
            questions[i].setName("Вопрос "+i);
            Option[] options = new Option[4];
            for (int j = 0; j < options.length; j++) {

                options[j] = new Option();
                options[j].setOptionId(j);
                options[j].setCorrect(false);
                options[j].setUserAnswer(false);
                options[j].setName("Ответ " + j);

            }
            questions[i].setOptions(options);
        }
        quiz.setQuestions(questions);
        quiz.setCorrect(0, 0);
        quiz.setCorrect(1, 1);
        quiz.setCorrect(2, 2);
        quiz.setCorrect(3, 3);
        quiz.setCorrect(4, 0);

        quiz.setUserAnswer(0, 0);
        quiz.setUserAnswer(1, 1);
        quiz.setUserAnswer(2, 2);
        quiz.setUserAnswer(3, 3);
        quiz.setUserAnswer(4, 0);


        Assert.assertEquals((float)5, quiz.markEstimate(), 0.1);

    }

    @Test
    public void allFault()
    {
        Quiz quiz = new Quiz();
        Question[] questions = new Question[5];
        questions = new Question[5];
        for (int i = 0; i < questions.length; i++) {

            questions[i] = new Question();
            questions[i].setQuestionId(i);
            questions[i].setName("Вопрос "+i);
            Option[] options = new Option[4];
            for (int j = 0; j < options.length; j++) {

                options[j] = new Option();
                options[j].setOptionId(j);
                options[j].setCorrect(false);
                options[j].setUserAnswer(false);
                options[j].setName("Ответ " + j);

            }
            questions[i].setOptions(options);
        }
        quiz.setQuestions(questions);
        quiz.setCorrect(0, 0);
        quiz.setCorrect(1, 1);
        quiz.setCorrect(2, 2);
        quiz.setCorrect(3, 3);
        quiz.setCorrect(4, 0);

        quiz.setUserAnswer(0, 3);
        quiz.setUserAnswer(1, 3);
        quiz.setUserAnswer(2, 3);
        quiz.setUserAnswer(3, 0);
        quiz.setUserAnswer(4, 3);

        Assert.assertEquals((float)2, quiz.markEstimate(), 0.01);

    }
}
