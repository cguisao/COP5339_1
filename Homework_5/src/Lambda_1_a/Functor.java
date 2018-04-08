/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_1_a;

/**
 *
 * @author carlo
 * @param <R>
 * @param <T>
 */
public interface Functor<R, T> {
    public R apply(T param);
    
}
