package com.testng.parameter.dataprovider;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ParametersSample extends BaseClass {

	@Parameters({"browser", "url"})
	@Test
	public void amazonProductSearch(String browser, String url) {
		browserLaunch(browser, url);
		WebElement search = findElementByXpath("//*[@id='twotabsearchtextbox']");
		search.sendKeys("Dell laptop");
		
		findElementByXpath("//*[@id='nav-search-submit-button']").click();
	}
	
}
