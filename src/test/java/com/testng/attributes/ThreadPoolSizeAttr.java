package com.testng.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ThreadPoolSizeAttr extends BaseClass{

	@Test(invocationCount = 10, threadPoolSize = 3)
	
	//How many times, we have to execute the @Test -> InvocationCount
	//Defines the no. of thread to be used while running a test method -> threadPoolSize
	public void searchJava() {
//		browserLaunch("chrome", "https://www.google.com/");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Java", Keys.ENTER);
		//search.submit();
		driver.close();
	}
}
