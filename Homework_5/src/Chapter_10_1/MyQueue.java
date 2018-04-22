/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_10_1;

import java.util.Collection;

/**
 *
 * @author carlo
 * @param <E>
 */
public interface MyQueue <E>{
    
    // return the top of the queue element or throw NoSuchElementException if empty	  
   E head();

   // remove and return the top of the queue element or throw NoSuchElementException if empty
   E dequeue();

   // add an element to the queue
   void enqueue(E e);

   // returns the size of the queue
   int size();

   // returns true if the queue is empty
   boolean isEmpty();

   // add elements to this queue from a collection c of E references:
   void addAll(Collection <? extends E> c);
}
