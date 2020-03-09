/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

public class Book {
    private String name;
    private String author;
    private int price;
      public Book(String a ,String n ,int p){
          author=a;
          name=n;
          price=p;
      }
   public Book(){}
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
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
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
    public static List<Book> generate(){
        List<Book>  data=new ArrayList<>();
        data.add(new Book("Tomson","Java JSP",600));
        data.add(new Book("Janet","Java Servlet",500));
        data.add(new Book("Janet","Oracle Database",800));        
        return data;
    }  
}
