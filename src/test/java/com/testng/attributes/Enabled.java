package com.testng.attributes;

import org.testng.annotations.Test;

public class Enabled {

	//Can we skip tc without using @Ignore? yes, we can by using enabled=false attribute
	
	@Test//(enabled=true)
	public void sample() {
		System.out.println("Test 1");
	}
	
	@Test(enabled=false)
	public void sample1() {
		System.out.println("Test 2");
	}
}
