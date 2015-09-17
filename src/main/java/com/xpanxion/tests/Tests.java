package com.xpanxion.tests;

import com.xpanxion.pages.HomePage;
import com.xpanxion.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {
    @Test
    public void Test1() {
        System.out.println(Constants.ON_GRID.toString());
        HomePage homePage = new HomePage(driver());
        homePage.navigateTo();

        String actualUrl = homePage.navigation().getCurrentUrl();
        String expectedUrl = homePage.getPageName();

        System.out.println("Actual: " + actualUrl);
        System.out.println("Expected: " + expectedUrl);

        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void Test2() {
        System.out.println(Constants.ON_GRID.toString());
        HomePage homePage = new HomePage(driver());
        homePage.navigateTo();

        String actualUrl = homePage.navigation().getCurrentUrl();
        String expectedUrl = homePage.getPageName();

        System.out.println("Actual: " + actualUrl);
        System.out.println("Expected: " + expectedUrl);

        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
