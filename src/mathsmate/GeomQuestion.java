/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

/**
 *
 * @author Bernard Skerritt x14110717
 */
public class GeomQuestion {
    private String questionTitle, image;
    private int correctAns;
    private String[] answers;
    
    public GeomQuestion(String questionTitle, int correctAns, String image, String[] answers) {
        this.questionTitle = questionTitle;
        this.correctAns = correctAns;
        this.image = image;
        this.answers = answers;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getImage() {
        return image;
    }
    
    public String getQuestionTitle(){
        return questionTitle;
    }
    
    public int getCorrectAns() {
        return correctAns;
    }
}
