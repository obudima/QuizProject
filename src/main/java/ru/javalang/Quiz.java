package ru.javalang;
import java.util.Date;

public class Quiz implements QuestionInterface
{
    private String quizName;
    private Question[] questions;
    private Date startTime;
    private Date stopTime;

    public String getQuizName() {
        return quizName;
    }
    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public Question[] getQuestions() {        return questions;    }
    public void setQuestions(Question[] questions) {        this.questions = questions;    }

    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }
    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Quiz(){
    };

    public float markEstimate(){
        float avg = 0;
        for (int  i = 0; i< questions.length; i++) avg += questions[i].markEstimate();
        avg = avg / questions.length;
        return Math.round(avg);
    }

    public void setCorrect(int questionNumber, int optionNumber){
        this.questions[questionNumber].setCorrect(optionNumber);
    };
    public void setUserAnswer(int questionNumber, int optionNumber){
        this.questions[questionNumber].setUserAnswer(optionNumber);
    };
}