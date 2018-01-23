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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**

/**
   A class for producing simple greetings. (Revised to include sayGoodbye)
*/
public class Greeter
{
   /**
      Constructs a Greeter object that can greet a person or 
      entity.
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
   public Greeter(String aName)
   {
      name = aName;
   }

   /**
      Greet with a "Goodbye" message.
      @return a message containing "Goodbye" and the name of
      the greeted person or entity.
   */
   public String sayGoodbye()
   {
      return "Goodbye, " + name + "!";
   }

   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }
   
   public String giveName()
   {
       return name;
   }
   
   private String name;
   
   public void swapNames(Greeter other) 
   {
       String temp = "";
       temp = this.name;
       this.name = other.name;
       other.name = temp;
   }
   
   public Greeter createQualifiedGreeter(String qualifier)
   {
       this.name += " " + qualifier;
       return new Greeter(qualifier + this.name);
   }
}
