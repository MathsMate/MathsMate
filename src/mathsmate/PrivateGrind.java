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
public class PrivateGrind implements GrindInterface{
    String name, url;
    int cost, phone;
    
    public PrivateGrind(String name, String url, int cost, int phone){
        this.name = name;
        this.url = url;
        this.cost = cost;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String getAddress() {
        return "";
    }

    @Override
    public int getPlaces() {
        return 0;
    }
    
    
}
