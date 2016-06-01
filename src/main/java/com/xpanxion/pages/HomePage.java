package com.xpanxion.pages;

import com.xpanxion.utils.Constants;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public static final String pageName = "index.html";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static String getPageName() {
        return Constants.BASE_URL + pageName;
    }

    public void navigateTo() {
        driver.get(Constants.BASE_URL + pageName);
    }

	@Override
	public void waitForPageLoad() {
		//pageHelper().wait(seconds, element);
	}
}
