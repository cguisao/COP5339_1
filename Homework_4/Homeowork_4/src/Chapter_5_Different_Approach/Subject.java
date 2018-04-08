/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5_Different_Approach;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author carlo
 */
public class Subject {
	
   private final List<Observer> observers = new ArrayList<>();
   private JFrame state;

   public JFrame getState() {
      return state;
   }

   public void setState(JFrame state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
       observers.forEach((observer) -> {
           observer.update();
       });
   } 	
}
