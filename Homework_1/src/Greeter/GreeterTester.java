/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Greeter;

/**
 *
 * @author carlo
 */
public class GreeterTester {
     public static void main(String[] args)
     {
         /*
            Part 2 of the homework 1
            Greetertester part 
        */
        
        Greeter worldGreeter = new Greeter("World");
        String greeting = worldGreeter.sayHello();
        System.out.println(greeting);

        greeting = worldGreeter.sayGoodbye();
        System.out.println(greeting);
        
        Greeter world = new Greeter("World");
        Greeter warcraft = new Greeter(" of Warcraft");
        
        System.out.println("\n Swap names function:");
        System.out.println("Before swapping names: " + world.giveName());
        world.swapNames(warcraft);
        System.out.println("After swapping names: " + world.giveName());
        
        System.out.println("\n Create Qualified Greeter function:");
        Greeter BetterGreeter = new Greeter("Wonderful");
        BetterGreeter.createQualifiedGreeter("World");
        System.out.println("After swapping names: " + BetterGreeter.giveName());
     }
}
