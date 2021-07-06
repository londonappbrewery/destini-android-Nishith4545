package com.londonappbrewery.destini;

public class Stories {
        private String Question;
        private String Answer;

    public Stories(String cQuestion,String cAnswer){
        Question = cQuestion;
        Answer = cAnswer;
    }
    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}
