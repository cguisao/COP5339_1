/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_1;

/**
 *
 * @author carlo
 */
public class Fib {

    private static int arg0 = 0;
    private static int arg1 = 0;
    /**
     * @param f0
     * @param f1
     */
    
    // constructor
	public Fib(int f0, int f1) 
	{
            arg0 = f0;
            arg1 = f1;
	}

	// computes F(n) using an ***iterative*** algorithm, where F(n) = F(n-1) + F(n-2) is the recursive definition.
	// use instance variables that store F(0) and F(1).
	// check parameter and throw exception if n < 0. Don't worry about arithmetic overflow.
	public int f(int n) {
            
            for (int i = 1; i <= n; i++)
            {
                System.out.println(i + ": " + fRec(i));
            }
            return 0;
	}

	// computes F(n) using the ***recursive*** algorithm, where F(n) = F(n-1) + F(n-2) is the recursive definition.
	// use instance variables that store F(0) and F(1).
	// check parameter and throw exception if n < 0. Don't worry about arithmetic overflow.
	public int fRec(int n) {
            if (n <= 1) return n;
            else return fRec(n-1) + fRec(n-2); 
	}
}