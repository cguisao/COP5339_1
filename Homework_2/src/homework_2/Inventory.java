/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

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

public class Inventory {
    
    private final HashMap<String, Product> inventory = new HashMap<>();
    
    void addProduct(Product product)
    {
        inventory.put(product.getUPC(), product);
    }
    
    boolean productExists(String upc)
    {
        return inventory.get(upc) != null;
    }
    
    /**
     * Get a Product from the inventory.
     * @param upc UPC number of the desired Product.
     * @return Product if it exists, null if it does not.
     */
    public Product getProduct(String upc) {
        return inventory.get(upc);
    }
    
    // prints all of the items from the inventory
    // it is called from the register function
    
    void print()
    {
        for(String s : inventory.keySet())
        {
            System.out.println("UPC: " + inventory.get(s).getUPC() 
                    + " Product: " + inventory.get(s).getProduct()
                    + " Price: " + inventory.get(s).getPrice());
        }
    }
}
