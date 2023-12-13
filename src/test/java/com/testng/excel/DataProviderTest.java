package com.testng.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class DataProviderTest {
	public class DataProviderSamples extends BaseClass {
		@Test(dataProvider ="excelData", dataProviderClass=DataProvExcel.class)
		public void testMethod(String username,String password) {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			WebElement user=driver.findElement(By.id("username"));
			WebElement pwd=driver.findElement(By.id("password"));
			WebElement log=driver.findElement(By.id("login"));
			user.sendKeys(username);
			pwd.sendKeys(password);
			log.click();
			
	 
	}}}
