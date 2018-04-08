/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_1_b;

import Lambda.Functor2;
import Lambda_1_a.Functor;
import java.util.LinkedList;

/**
 *
 * @author Carlos Guisao
 * @param <T>
 */
public class MyList<T> extends LinkedList<T>{
    
    
     public <R> LinkedList map(Functor<R,T> fo){
        
        MyList<T> list = new MyList<>();
        
        MyList.this.forEach((item) -> {
            list.add((T) fo.apply(item));
        });
        
        return list;
    }
    
    public T reduce(Functor2<T,T,T> fo2, T initialValue
        , LinkedList<T> items) {
        
        T result = initialValue;
        
        for(T item : items)
        {
            result = fo2.apply(result, item);
        }
        
        return result;
     }
    
    public static void main(String[] args) {
        
        
        System.out.println("TimesTwoFun function demostrated");
        TimesTwoFun tt = new TimesTwoFun();
        System.out.println(tt.apply(10));
        
        System.out.println("Using Lambda expressions 10 * 2");
        
        Functor<Integer, Integer> lambda = (x) -> x*2;
        
        System.out.println(lambda.apply(10));
        
        MyList<Integer> myInts = new MyList<>();
        myInts.add(-2);
        myInts.add(1);
        myInts.add(0);
        myInts.add(4);
        
        System.out.println("Linkedlist before using the Functor functions");
        System.out.println(myInts);
        
        Functor<Integer, Integer> TimesTwoFun = (x) -> x*2;
        
        System.out.println("Linkedlist after using the Functor functions");
        System.out.println(myInts.map(TimesTwoFun));
        
    }
}
