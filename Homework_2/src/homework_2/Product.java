/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

/**
 *
 * @author carlos Guisao
 * COP 4331
 * Homework 2 Question 2.4
 * 
 * This class allows to register new items 
 * All items are objects saved in the product class
 */

public class Product {
    
    private final Integer UPC;
    private final String Product;
    private final Double Price;
    
    /**
     * Initializes a product with the given information.
     * @param upc Integer with the UPC
     * @param product product name
     * @param price product price
     */
    
    public Product(Integer upc, String product, Double price)
    {
        this.UPC = upc;
        this.Price = price;
        this.Product = product;
    }
    
    /**
     * UPC getter
     * @return product UPC number
     */
    
    public String getUPC()
    {
        return UPC.toString();
    }
    
    /**
     * name getter
     * @return product name
     */
    
    public String getProduct()
    {
        return Product;
    }
    
    /**
     * price getter
     * @return product price as a String
     */
    
    public String getPrice()
    {
        return Price.toString();
    }
    
    /**
     * gets all product details and labels the values
     * @return an array of labeled product details
     */
    
    public String[] getSummary()
    {
        String [] summary = new String[3];
        summary[0] = UPC.toString();
        summary[1] = Product;
        summary[2] = Price.toString();
        
        return summary;
    }
}
