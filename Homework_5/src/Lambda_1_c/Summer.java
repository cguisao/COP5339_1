/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_1_c;

/**
 *
 * @author Carlos Guisao
 */
public class Summer implements Functor2{

    @Override
    public Object apply(Object param1, Object param2) {
        return (int)param1 + (int)param2;
    }
}