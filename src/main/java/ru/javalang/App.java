package ru.javalang;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
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

        System.out.println(quiz.markEstimate());
    }
}
