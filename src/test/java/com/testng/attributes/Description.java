package com.testng.attributes;

import org.testng.annotations.Test;

public class Description {

	@Test(description="This testcase sample for Description attribute")
	public void testDesc() {
		System.out.println("Test with Description");
	}
}
