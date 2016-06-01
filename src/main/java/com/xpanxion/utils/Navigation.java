package com.xpanxion.utils;

import org.openqa.selenium.*;

import com.xpanxion.pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Navigation extends BasePage {
    //private WebDriver driver;
    private String homeLink = "home";

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public Navigation(WebDriver driver) {
    	super(driver);
    }

    public List<WebElement> NavigationLinkList() {
        List<WebElement> liList = driver.findElements(By.cssSelector("#header_nav ul li a"));
        List<WebElement> anchorList = new ArrayList<WebElement>();

        for(WebElement anchor : liList) {
            anchorList.add(anchor);
        }
        return anchorList;
    }

	@Override
	public void navigateTo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitForPageLoad() {}
}
