package ru.javalang;

public class Question implements QuestionInterface{
    private int questionId;
    private String name;
    private Option[] options;
//    private byte score;

    Question(    ){
        this.options = new Option[4];
//                for (Option i: options){
//                    i = new Option();
//                    i.setCorrect(false);
//                i.setUserAnswer(false);
//                    i.setName("Ответ "+i);}
        for (int i=0; i<options.length; i++)
        {
            options[i] = new Option();
            options[i].setOptionId(i);
            options[i].setCorrect(false);
            options[i].setUserAnswer(false);
            options[i].setName("Ответ "+i);

        }
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

//    public byte getScore() {
//        return score;
//    }
//    public void setScore(byte score) {
//        this.score = score;
//    }

    public float markEstimate(){
        boolean flag = false;
        for (int  i = 0; i< options.length; i++) if (options[i].getCorrect()&&options[i].getUserAnswer()) flag = true;
        if (flag) return 5; else return 2;
    }

}
