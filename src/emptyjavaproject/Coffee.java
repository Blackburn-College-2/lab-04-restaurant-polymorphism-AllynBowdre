/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.MenuItem;
import edu.blackburn.cs.cs212.restaurantbase.Money;

/**
 *
 * @author allyn
 */
public class Coffee extends MenuItem {
    String name = super.getName();
    size Size;
    public Coffee(String name, Money basePrice,size Size) {
        super(name, basePrice);
        this.Size=Size;
    }
   
    @Override
    public String toString(){
        return this.Size  + "\t" + getReceiptItem() +"\t" + getPrice();
    }

    @Override
    public Money getPrice() {
       return super.getBasePrice();
    }

    @Override
    public String getReceiptItem() {
        return this.Size  + "\t" + name +"\t" + getPrice() + "\n";
    }
    
}
