/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

/**
 *
 * @author carlos Guisao
 * COP 4331
 * Homework 2 Question 2.4
 * 
 * This class allows to register new items 
 * All items are objects saved in the product class
 */

public class Main {

    public static void main(String[] args) 
    {
        
        Product milk = new Product(1, "Milk", 5.26);
        Product rice = new Product(2, "Rice", 8.26);
        Product oil = new Product(3, "Oil", 10.26);
        Product potatoes = new Product(4, "Potatoes", 4.26);
        Product tomatoes = new Product(5, "Tomatoes", 6.26);
        Product banana = new Product(6, "Banana", 5.26);
        
        Register register = new Register();
        
        register.register(milk);
        register.register(rice);
        register.register(oil);
        register.register(potatoes);
        register.register(tomatoes);
        register.register(banana);
        
        register.process();
        
    }
    
}
