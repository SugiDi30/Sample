package com.testng.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class TimeOutAttr extends BaseClass{

	@Test(timeOut=4000)
	public void searchJava() {
		browserLaunch("chrome", "https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Java", Keys.ENTER);
		//search.submit();
	}
}
