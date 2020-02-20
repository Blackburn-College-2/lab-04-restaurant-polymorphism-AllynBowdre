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
public class Syrup implements Orderable{
    
Money price ;
String flavor;
    
    public Syrup(String flavor,Money price){
        this.flavor=flavor;
        this.price=price;
    }
    @Override
    public Money getPrice() {
       return price;
    }

    @Override
    public String getReceiptItem() {
        return flavor + "\t" + price;
    }
    
}
