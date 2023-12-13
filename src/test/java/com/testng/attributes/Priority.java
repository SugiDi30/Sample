package com.testng.attributes;

import org.testng.annotations.Test;

public class Priority {
	
	//1. Can we give same priority for 2 @Test? yes, we can it will follow alphabetical order 
										   //in the @Test methods name
	//2. If we didn't declare any priority for one @Test, when it will execute?
	         //it will automatically executed in the 0th priority 
	//3. Can we declare negative values in Priority? 
			// yes, we can 
	
	@Test(priority=-3)
	public void sampleOne() {
		System.out.println("Test 7");
	}
	
	@Test //priority=0
	public void sample() {
		System.out.println("Test 6");
	}

	@Test(priority=1)
	public void testt() {
		System.out.println("Test 1");
	}
	
	@Test(priority=1)
	public void tesi() {
		System.out.println("Test 2");
	}
	
	@Test(priority=3)
	public void testing() {
		System.out.println("Test 3");
	}
	
	@Test(priority=4)
	public void tesd() {
		System.out.println("Test 4");
	}
	
	@Test(priority=5)
	public void tea() {
		System.out.println("Test 5");
	}
}
