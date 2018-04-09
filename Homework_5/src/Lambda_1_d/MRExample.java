/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_1_d;

import Lambda_1_a.Functor;
import Lambda_1_b.MyList;
import Lambda_1_c.Functor2;

/**
 *
 * @author Carlos Guisao
 */
public class MRExample {
    public static void main(String[] args) {
    
        MyList<String> ls = new MyList<>();
        
        ls.add("Patricia");
        ls.add("Andres");
        ls.add("Bruce");
        ls.add("Winny the poo");
        
        System.out.println(ls);
        
        Functor<Integer, String> LengthFun = (x) -> x.length();
        
        System.out.println("Total lenght of each string:");
        
        System.out.println(ls.map(LengthFun));
        
        MyList<Integer> lsInt = new MyList<>();
        
        System.out.println("Total number of chars in all strings");
        
        Functor2<Integer, Integer, Integer> sum = (x, y) -> x + y;
        
        System.out.println(lsInt.reduce(sum, 0, ls.map(LengthFun)));
        
    }
}
