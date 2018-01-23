/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class main {
        public static void main(String[] args) throws Exception {
        
        /*1
            Write a Java program that calculates and displays the Fibonacci 
            series, defined by the recursive formula F(n) = F(n-1) + F(n-2).
            F(0) and F(1) are given on the command line.
            Define and use a class Fib with the following structure:
        */
            
        int arg0 = 0;
        int arg1 = 0;
        
        Scanner cin = new Scanner(System.in);
        
        try{
            arg0 = cin.nextInt();
            arg1 = cin.nextInt();
        }catch(InputMismatchException ex)
        {
            throw new Exception("No a good, try again. This time an integer: " 
                    + ex.getMessage());
        }
        
        Fib fibonacci = new Fib(arg0, arg1);
        
        fibonacci.f(arg1);
        
    }
}
