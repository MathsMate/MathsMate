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
public class GeomFormulaStorage extends TrigFormulaStorage {
    private String url;
    public GeomFormulaStorage(String title, String path, String url) {
        super(title, path);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
