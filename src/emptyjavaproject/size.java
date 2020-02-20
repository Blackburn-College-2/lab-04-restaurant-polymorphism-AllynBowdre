/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.Measurement;

/**
 *
 * @author allyn
 */
public class size extends Measurement{
    String name;
    
    public size(String name){
        this.name=name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
    
}
