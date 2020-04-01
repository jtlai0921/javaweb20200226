/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author teacher
 */
public class Supplier {
   private int sup_id;
    private String sup_name;
    private String street;
    private String city;
    private String state;
    private String zip;

    /**
     * @return the sup_id
     */
    public Supplier(){
        
    }
    public Supplier(int id,String n,String s , String c , String st,String zp){
          sup_id=id;
          sup_name=n;
          street=s;
          city=c;
          state=st;
          zip=zp;
    }
    public int getSup_id() {
        return sup_id;
    }

    /**
     * @param sup_id the sup_id to set
     */
    public void setSup_id(int sup_id) {
        this.sup_id = sup_id;
    }

    /**
     * @return the sup_name
     */
    public String getSup_name() {
        return sup_name;
    }

    /**
     * @param sup_name the sup_name to set
     */
    public void setSup_name(String sup_name) {
        this.sup_name = sup_name;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }
   public String toString(){
       return "編號:"+sup_id+" 供應商:"+sup_name+" 街道:"+street+" 城市:"+city+" 省:"+state+" 郵遞區號:"+zip;
   }  
}
