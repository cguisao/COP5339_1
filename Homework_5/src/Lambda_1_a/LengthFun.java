/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_1_a;

/**
 *
 * @author Carlos Guisao
 */
public class LengthFun {

    public static void main(String[] args) {
        
        System.out.println("Example without using Lambda expressions");
        String test = "Carlos";
        System.out.println(test.length());
        
        System.out.println("Example using Lambda expresions");
        Functor<Integer, String> LengthFun = (x) -> x.length();
        System.out.println(LengthFun.apply("Carlos"));
        
    }
}
