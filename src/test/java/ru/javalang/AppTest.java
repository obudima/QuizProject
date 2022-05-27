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
