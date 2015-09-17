package com.xpanxion.utils;

import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class Navigation {
    private WebDriver driver;
    private String homeLink = "home";

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public Navigation(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> NavigationLinkList() {

        List<WebElement> liList = driver.findElements(By.cssSelector("#header_nav ul li a"));
        List<WebElement> anchorList = new ArrayList<WebElement>();

        for(WebElement anchor : liList) {
            anchorList.add(anchor);
        }

        return anchorList;
    }
}
