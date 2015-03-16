/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

/**
 *
 * @author Aaron
 */
public class Subject {

    private String subjectName;
    private boolean isHigher;
    private String grade;
    private int points;

    public Subject(String subjectName, boolean isHigher, String grade, int points) {
        this.subjectName = subjectName;
        this.isHigher = isHigher;
        this.grade = grade;
        this.points = points;
    }

    public void calculatePoints() {
        switch (grade) {
            case "A1":
                if (this.isHigher) {
                    points = 100;
                } else {
                    points = 60;
                }
                break;
            case "A2":
                if (this.isHigher) {
                    points = 90;
                } else {
                    points = 50;
                }
                break;
            case "B1":
                if (this.isHigher) {
                    points = 85;
                } else {
                    points = 45;
                }
                break;
            case "B2":
                if (this.isHigher) {
                    points = 80;
                } else {
                    points = 40;
                }
                break;
            case "B3":
                if (this.isHigher) {
                    points = 75;
                } else {
                    points = 35;
                }
                break;
            case "C1":
                if (this.isHigher) {
                    points = 70;
                } else {
                    points = 30;
                }
                break;
            case "C2":
                if (this.isHigher) {
                    points = 65;
                } else {
                    points = 25;
                }
                break;
            case "C3":
                if (this.isHigher) {
                    points = 60;
                } else {
                    points = 20;
                }
                break;
            case "D1":
                if (this.isHigher) {
                    points = 55;
                } else {
                    points = 15;
                }
                break;
            case "D2":
                if (this.isHigher) {
                    points = 50;
                } else {
                    points = 10;
                }
                break;
            case "D3":
                if (this.isHigher) {
                    points = 45;
                } else {
                    points = 5;
                }
                break;
            case "E":
                points = 0;
                break;
            case "F":
                points = 0;
                break;
            case "NG":
                points = 0;
                break;
            default:
                points = 0;
                break;
        }
        
        if(this.isHigher && this.subjectName.equals("Maths")){
            points += 25;
        }
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setIsHigher(boolean isHigher) {
        this.isHigher = isHigher;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoints() {
        return points;
    }
}
