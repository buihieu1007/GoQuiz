package com.example.myapplication;

public class Question {
    int questionID;
    String questionText;
    String[] answers;
    int correctAnswerIndex;
    String subject;
    boolean isHard;
    public Question(int questionID, String questionText, String[] answers, int correctAnswerIndex, String subject, boolean isHard) {
        this.questionID = questionID;
        this.questionText = questionText;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
        this.subject = subject;
        this.isHard = isHard;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public String getSubject() {
        return subject;
    }
    public Boolean cokhokhong()
    {
        return isHard;
    }
}
