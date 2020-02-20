/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.*;
import java.util.ArrayList;

/**
 *
 * @author allyn.bowdre
 */
public class Sandwich implements Orderable{
ArrayList <Orderable> contents = new ArrayList<>();
Money basePrice;
String name;
    public Sandwich(String name,Money basePrice){
        this.basePrice=basePrice;
        this.name=name;
    } 
    @Override
    public Money getPrice() {
        return basePrice;
    }
    public void add(Orderable o){
        contents.add(o);
    }

    @Override
    public String getReceiptItem() {
        return name+  "\t" + basePrice;
    }
    
}
