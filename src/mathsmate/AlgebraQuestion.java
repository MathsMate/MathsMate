/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

/**
 *
 * @author Benrnard Skerritt x14110717
 */
public class AlgebraQuestion {
    private String questionTitle, a1, a2, a3;
    private int correctAns;
    
    public AlgebraQuestion(String questionTitle, String a1, String a2, String a3, int correctAns) {
        this.questionTitle = questionTitle;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.correctAns = correctAns;
    }
    
    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }
    
    public String getQuestionTitle(){
        return questionTitle;
    }
    
    public int getCorrectAns() {
        return correctAns;
    }
}
