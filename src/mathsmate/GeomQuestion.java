/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

/**
 *
 * @author Ben, Aaron, Ian, Emlyn
 */
public class GeomQuestion {
    private String questionTitle;
    private int correctAns;
    
    public GeomQuestion(String questionTitle, int correctAns) {
        this.questionTitle = questionTitle;
        this.correctAns = correctAns;
    }
    
    public String getQuestionTitle(){
        return questionTitle;
    }
    
    public int getCorrectAns() {
        return correctAns;
    }
}
