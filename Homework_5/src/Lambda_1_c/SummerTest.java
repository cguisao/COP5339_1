/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_1_c;

import Lambda_1_b.MyList;
import java.util.LinkedList;

/**
 *
 * @author Carlos Guisao
 */
public class SummerTest {
    public static void main(String[] args) {
        
        
        LinkedList<Integer> myInts = new LinkedList<>();
        
        myInts.add(1);
        myInts.add(2);
        myInts.add(0);
        myInts.add(4);

        System.out.println(myInts);
        
        MyList list = new MyList();
        
        Functor2<Integer, Integer, Integer> variable = (x, y) -> x + y; 
        
        System.out.println(variable.apply(5, 6));
        
        System.out.println(list.reduce(variable, 3, myInts));
        
    }
}
