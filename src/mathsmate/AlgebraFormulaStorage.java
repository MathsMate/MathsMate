/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

/**
 *
 * @author Ian Donnelly X14111659
 */
public class AlgebraFormulaStorage {
    private String title1, formula1, title2, formula2, title3, formula3, title4, formula4, pageTitle;

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public void setTitle4(String title4) {
        this.title4 = title4;
    }

    public void setFormula4(String formula4) {
        this.formula4 = formula4;
    }

    public String getTitle4() {
        return title4;
    }

    public String getFormula4() {
        return formula4;
    }

    public String getTitle1() {
        return title1;
    }

    public String getFormula1() {
        return formula1;
    }

    public String getTitle2() {
        return title2;
    }

    public String getFormula2() {
        return formula2;
    }

    public String getTitle3() {
        return title3;
    }

    public String getFormula3() {
        return formula3;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public void setFormula1(String formula1) {
        this.formula1 = formula1;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public void setFormula2(String formula2) {
        this.formula2 = formula2;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public void setFormula3(String formula3) {
        this.formula3 = formula3;
    }

    public AlgebraFormulaStorage(String pageTitle, String title1, String formula1, String title2, String formula2, String title3, String formula3, String title4, String formula4) {
        this.pageTitle = pageTitle;
        this.title1 = title1;
        this.formula1 = formula1;
        this.title2 = title2;
        this.formula2 = formula2;
        this.title3 = title3;
        this.formula3 = formula3;
        this.title4 = title4;
        this.formula4 = formula4;
    }
    
}
