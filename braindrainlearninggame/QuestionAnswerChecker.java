/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braindrainlearninggame;

/**
 *
 * @author luisp
 */
public class QuestionAnswerChecker {
    private String question;
    private String answer;

    public QuestionAnswerChecker(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean checkAnswer(String userAnswer) {
        return answer != null && answer.equalsIgnoreCase(userAnswer);
    }
}
