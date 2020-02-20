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
public class Topping implements Orderable{
    Money price ;
    String type;
    
    public Topping(String type,Money price){
        this.type=type;
        this.price=price;
    }
    
    @Override
    public Money getPrice() {
       return price;
    }

    @Override
    public String getReceiptItem() {
        return type + "\t" + price;
    }
}
