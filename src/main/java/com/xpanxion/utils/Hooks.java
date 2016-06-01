package com.xpanxion.utils;

import org.openqa.selenium.WebDriver;

import com.xpanxion.tests.BaseTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void before() {
		WebDriver driver = BaseTest.setBrowser(Constants.BROWSER);
		LocalDriverManager.setDriver(driver);
	}
	
	@After
	public void after() {
		LocalDriverManager.getDriver().quit();
	}
}
