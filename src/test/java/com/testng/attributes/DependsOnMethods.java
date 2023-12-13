package com.testng.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void addToCart() {
		System.out.println("Add to Cart");
	}
	
//	@Test
//	public void signIn() {
//		System.out.println("Used logged in");
//		Assert.assertTrue(false);
//	}
	
	//Can we use different class method in dependOnMethods attribute?
	    //yes we can but, we have to declare with packagename.ClassName.methodName
	
	//@Test(dependsOnMethods = "signIn")
	@Test(dependsOnMethods = "com.testng.attributes.Description.testDesc")
	public void checkout() {
		System.out.println("Checkout");
	}
}
