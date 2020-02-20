/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.*;

/**
 *
 * estimated time 28hrs
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coffee Mocha = new Coffee("Mocha", new Money(new Currency("Dollars", "$"), 3), new size("Large"));
        Coffee Latte = new Coffee("Latte", new Money(new Currency("Dollars", "$"), 3), new size("Large"));
        Coffee IV = new Coffee("Iced Vanilla", new Money(new Currency("Dollars", "$"), 3), new size("Large"));
        Coffee IC = new Coffee("Iced Caramel", new Money(new Currency("Dollars", "$"), 3), new size("Large"));
        Coffee Smores = new Coffee("S'mores", new Money(new Currency("Dollars", "$"), 4), new size("Large"));
        
        Receipt receipt1 = new Receipt();
        receipt1.add(Mocha);
        receipt1.add(Latte);
        receipt1.add(IV);
        receipt1.add(IC);
        receipt1.add(Smores);

        System.out.println(receipt1.prepare());
    }

}
