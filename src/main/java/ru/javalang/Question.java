package ru.javalang;

public class Question implements QuestionInterface{
    private int questionId;
    private String name;
    private Option[] options;
//    private byte score;

    Question(){
    };

    public int getQuestionId() {
        return questionId;
    }
    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getName() {
        return name;
    }
    public String printQuestion() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Option[] getOptions() {
        return options;
    }
    public void setOptions(Option[] options) {
        this.options = options;
    }

    public void setCorrect(int optionNumber) {
        this.options[optionNumber].setCorrect(true);
    }

    public void setUserAnswer(int optionNumber) {
        this.options[optionNumber].setUserAnswer(true);
    }


    public float markEstimate(){
        boolean flag = false;
        for (int  i = 0; i< options.length; i++) if (options[i].getCorrect()&&options[i].getUserAnswer()) flag = true;
        if (flag) return 5; else return 2;
    }

}
