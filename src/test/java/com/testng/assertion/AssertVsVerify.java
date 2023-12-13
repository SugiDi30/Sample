package com.testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

	@Test
	public void assertMethod() {
		
		//Hard Assertion
			//Checks if the given condition is true or false 
			// If the condition is true, the program will execute the next phase of testing
		    // If it's false, then execution will be stopped and nothing will be executed.
		
		String expectedName = "Eswari";
		String actualName = "Easwari";
		
		Assert.assertEquals(actualName, expectedName);
		
		System.out.println("Testing done");
	}
	
	
	@Test
	public void verifyMethod() {
		
		//Soft Assertion
			//Checks if the given condition is true or false
		    //It doesn't halts the program execution, even any failure during verification would 
		    //not stop the execution and all test phases will be executed.
		
		String expectedName = "Eswari";
		String actualName = "Easwari";
		
		SoftAssert verify = new SoftAssert();
		verify.assertEquals(actualName, expectedName);
		
		System.out.println("Validation Completed");
	}
}
