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
public class InstitutionGrind extends PrivateGrind implements GrindInterface{
    String address;
    int places;
    
    public InstitutionGrind(String name, String url, int cost, int phone, int places, String address) {
        super(name, url, cost, phone);
        this.address = address;
        this.places = places;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }
    
}
