package org.firsttestNGUsingMaven;

import org.testng.annotations.Test;

public class A
{
	

	@Test(dependsOnGroups = { "testThree", "b" })
	  //here we are adding only one dependency. so definitely test 3 will will run first here. But test 3 mudinja udane test 1 run aagadhu. Test two run agudhu. Which means it is following 
	    public void testOne() {
	        System.out.println("Test method one");
	    }
	 
	@Test
	    public void b() {
	        System.out.println("Test method b");
	    }
	
	@Test
    public void a() {
        System.out.println("Test method a");
    }
	 
	@Test
	    public void testThree() {
	        System.out.println("Test method three");
	    }



}
