/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author teacher
 */
public class MyList {
    static List<String>  data=new ArrayList<>();
    public static List<String> create(){
        data.add("Amy");
        data.add("Mary");
        data.add("John");
        data.add("Bob");
        data.add("Tom");        
        return data;
    }
}
