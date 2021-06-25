package org.firsttestNGUsingMaven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class B 
{
	
	
	@Test
	private void test1() {
		System.out.println("inside class B test case 1 " +Thread.currentThread().getId());

	}
	
	@Test
	private void test2() {
		System.out.println("inside class B test case 1 " +Thread.currentThread().getId());

	}
	
	
}
