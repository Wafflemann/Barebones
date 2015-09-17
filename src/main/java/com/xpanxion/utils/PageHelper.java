package com.xpanxion.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHelper {
    private WebDriver driver;

    public PageHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void wait(int seconds, By element) {
        WebDriverWait wait = new WebDriverWait(driver, (seconds * 1000));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void wait(int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, (seconds * 1000));
    }
}
