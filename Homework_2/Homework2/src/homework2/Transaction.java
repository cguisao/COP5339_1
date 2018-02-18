/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 *
 * @author carlos Guisao
 * COP 4331
 * Homework 2 Question 2.4
 * 
 * This class allows to register new items 
 * All items are objects saved in the product class
 */

public class Transaction {
    /**
     * Stores the purchased Products as key-value pairs.
     * Key: UPC number    Value: Product
     */
    private HashMap<String, Product> items;
    /**Stores total and current balance in a more precise data structure*/
    private BigDecimal total, balance;

    public Transaction(){
        items = new HashMap<String, Product>();
        total = balance = new BigDecimal(""+0.00).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Add a Product to be purchased.
     * @param item The Product that is purchased.
     */
    public void addItem(Product item) {
        items.put(item.getUPC(), item);
        total = total.add(new BigDecimal(item.getPrice()));
        balance = balance.add(new BigDecimal(item.getPrice()));
    }
    
    // this fucntion prints the current items added to the
    // transaction 
    
    void print()
    {
        double total = 0.00;
        
        System.out.println("Currently added");
        
        for(String s : items.keySet())
        {
            System.out.println("UPC: " + items.get(s).getUPC() 
                    + " Product: " + items.get(s).getProduct()
                    + " Price: " + items.get(s).getPrice());
            total = total + Double.parseDouble(items.get(s).getPrice());
        }
        System.out.println("Total: " + total);
    }
    
    // prints the final receipt to the user.
    
    void printReceipt()
    {
        double total = 0.00;
        System.out.println("********************************");
        System.out.println("Here is your receipt and your total");
        for(String s : items.keySet())
        {
            System.out.println("UPC: " + items.get(s).getUPC() 
                    + " Product: " + items.get(s).getProduct()
                    + " Price: " + items.get(s).getPrice());
            total = total + Double.parseDouble(items.get(s).getPrice());
        }
        System.out.println("Total: " + total);
        
        System.out.println("********************************");
        System.out.println("Thank you and have a nice day5");
    }
}
