package edu.csueastbay.cs401.agarcia;

import edu.csueastbay.cs401.share.PersonalTruth;

// class is used to create and our own personal truth
public class Truth extends PersonalTruth {
    public Truth(String question, String answer) {
        super(question, answer);
    }

    @Override
    public String getQuestion() {
        return super.getQuestion();
    }

    @Override
    public String getAnswer() {
        return super.getAnswer();
    }
}
