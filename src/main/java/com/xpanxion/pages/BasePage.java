package com.xpanxion.pages;

import com.xpanxion.utils.Navigation;
import com.xpanxion.utils.PageHelper;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    public WebDriver driver;
    private Navigation navigation;
    private PageHelper pageHelper;
    public static String pageName;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        navigation = new Navigation(driver);
        pageHelper = new PageHelper(driver);
        pageName = "";
    }

    public abstract void navigateTo();

    public Navigation navigation() {
        return navigation;
    }

    public PageHelper pageHelper() {
        return pageHelper;
    }
}
