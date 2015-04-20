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
class Notes implements Serializable{
    String note;
    
    public Notes(String note){
        this.note = note;
    }
    
    public String getNote(){
        return note;
    }
    
}
