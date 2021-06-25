package org.firsttestNGUsingMaven;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;



public class C 
{
    private int param;
 
    public C(int param) {
        this.param = param;
    }
 
    @Test
    public void testMethodOne() {
        int opValue = param + 1;
        System.out.println("Test method one output: " + opValue);
    }
 
    @Test
    public void testMethodTwo() {
        int opValue = param + 2;
        System.out.println("Test method two output: " + opValue);
    }
}
 
class SimpleTestFactory 
{
    @Factory
    private Object[] factoryMethod() 
    {
    	C obj = new C(0);
    	C obj1 = new C(1);
        return new Object[] { obj, obj1 };
    }
}