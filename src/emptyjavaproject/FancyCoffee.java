/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import java.util.ArrayList;

/**
 *
 * @author allyn.bowdre
 */
public class FancyCoffee extends Coffee{
    ArrayList <Orderable> addOn = new ArrayList<Orderable>();
    
    public FancyCoffee(String name, Money basePrice, size Size) {
        super(name, basePrice, Size);
    }
    public void add(Orderable o){
        addOn.add(o);
    }
    
    @Override
    public String getReceiptItem() {
        String k = this.Size  + "\t" + name +"\t" + getPrice() + "\n";
        for(int x = 0; x<addOn.size();x++){
            k = k + "\t" + addOn.get(x).getReceiptItem() + "\n";
        }
        return k;
    }
    
}
