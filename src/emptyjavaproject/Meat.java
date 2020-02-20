/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.*;

/**
 *
 * @author allyn.bowdre
 */
public class Meat implements Orderable{
    Money price ;
    String name;
    
    public Meat(String name,Money price){
        this.name=name;
        this.price=price;
    }
    
    @Override
    public Money getPrice() {
       return price;
    }

    @Override
    public String getReceiptItem() {
        return name + "\t" + price;
    }
}
