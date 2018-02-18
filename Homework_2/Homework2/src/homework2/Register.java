/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author carlos Guisao
 * COP 4331
 * Homework 2 Question 2.4
 * 
 * This class allows to register new items 
 * All items are objects saved in the product class
 */
public class Register {
    
    private final Inventory inventory;
    private final Transaction transaction;
    
    // Initialized the inventory and trasaction class
    public Register()
    {
        inventory = new Inventory();
        transaction = new Transaction();
    }
    
    // This class addes a product to the inventory HashMap
    
    public void register(Product product)
    {
        inventory.addProduct(product);
    }
    
    //This method prints all of the items saved in the inventory
    
    public void print()
    {
        inventory.print();
    }
    
    // process the main logic
    // this loop prints the items in the inventory once
    // then waits for the user to enter "p" for the program to end
    // if there is an UPC that is not in the list or does not exists
    // it gives a chance to the user to continue with a warning.
    
    public void process()
    {
        String currentUPC = "";
        
        Scanner in = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("Welcome to Carlos' Store, add products \n "
                + " using the following UPCs");
        System.out.println("********************************");
        
        print();
        
        while(!"p".equals(currentUPC))
        {
            currentUPC = in.next();
            
            // check that the upc exists
            
            if(inventory.productExists(currentUPC))
            {
                transaction.addItem(inventory.getProduct(currentUPC));
                transaction.print();
            }
            else if("p".equals(currentUPC))
            {
               transaction.printReceipt();
            }
            else
            {
                System.out.println("That UPC does not exist, please try again1");
            }
            
        }
        
    }
    
}
