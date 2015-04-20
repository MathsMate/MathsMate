/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.io.Serializable;

/**
 *
 * @author Emlyn Farrell
 */
public class ImageNotes extends Notes implements Serializable{

    String link;
    
    public ImageNotes(String note, String link) {
        super(note);
        this.link = link;
    }
    
    public String getLink() {
        return link;
    }
    
}
