package com.testng.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {

	@Test(dependsOnMethods="signIn", alwaysRun=true)
	public void checkout() {  //Guest user
		System.out.println("Checkout");
	}
	
	@Test
	public void signIn() {
		Assert.assertTrue(false);
		System.out.println("Sign In");
	}
}
