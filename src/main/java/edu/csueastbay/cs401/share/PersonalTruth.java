package edu.csueastbay.cs401.share;

public class PersonalTruth {
    private String question;
    private String answer;

    public PersonalTruth(String question, String answer) {
        this.question = question;
         this.answer = answer;

    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
