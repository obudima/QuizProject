package ru.javalang;

public class Option {
    private long optionId;
    private String name;
    private boolean correct;
    private boolean userAnswer;

    public long getOptionId() {
        return optionId;
    }
    public void setOptionId(long optionId) {
        this.optionId = optionId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getCorrect() {
        return correct;
    }
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public boolean getUserAnswer() {
        return userAnswer;
    }
    public void setUserAnswer(boolean userAnswer) {
        this.userAnswer = userAnswer;
    }
    Option(    ){
    };

}
