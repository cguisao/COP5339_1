/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Chapter_3.Complex;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 *
 * @author carlo
 */
public class TestComplex extends TestCase {
    
    public void testEquals()
    {
        System.out.println("run test Equal");
        double a = 1, b = 2, c = 1, d = 2;
	double e = a, f = b;
	Complex x = new Complex(a,b);
	Complex y = new Complex(c,d);

	Complex z = new Complex(e,f);

	Assert.assertTrue(z.equals(y));
    }
    
    /**
     *
     */
    public void testAdd() {
        System.out.println("run test add");
	double a = 1, b = 2, c = -3, d = 4;
	double e = a + c, f = b + d;
	Complex x = new Complex(a,b);
	Complex y = new Complex(c,d);

	Complex w = x.add(y);

	Complex z = new Complex(e,f);

	// set up Complex objects
	// test condition using the Complex equals() method:
	Assert.assertTrue(z.equals(w));
    }
    
    public void testSub() {
        System.out.println("run test Sub");
	double a = 1, b = 2, c = -3, d = 4;
	double e = a - c, f = b - d;
	Complex x = new Complex(a,b);
	Complex y = new Complex(c,d);

	Complex w = x.sub(y);

	Complex z = new Complex(e,f);

	// set up Complex objects
	// test condition using the Complex equals() method:
	Assert.assertTrue(z.equals(w));
    }
    
    public void testMult() {
        System.out.println("run test Mult");
	double a = 1, b = 2, c = -3, d = 4;
	double e = (a * c) - (b * d);
        double f = (a * d) + (b * c);
	Complex x = new Complex(a,b);
	Complex y = new Complex(c,d);

	Complex w = x.mult(y);

	Complex z = new Complex(e,f);

	// set up Complex objects
	// test condition using the Complex equals() method:
	Assert.assertTrue(z.equals(w));
    }
    
    public void testDivide() {
        System.out.println("run test Divide");
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(3, -2);
	Complex quot = new Complex(5.0/13.0, 12.0/13.0);
        assertTrue(quot.equals(c1.div(c2)));
    }
}
