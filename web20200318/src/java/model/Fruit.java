/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author teacher
 */
public class Fruit {
    private String name;
    private String place;
    private int price;
    public Fruit(String n,String pa,int pr)
    {
        name=n;
        place=pa;
        price=pr;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
   public static List<Fruit> create(){
       List<Fruit>  data=Arrays.asList(new Fruit("Apple","USA",30),new Fruit("Banana","TW",60),new Fruit("Cherry","CA",300));
       return data;
   }   
}
