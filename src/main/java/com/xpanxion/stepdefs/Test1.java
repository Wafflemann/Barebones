package com.xpanxion.stepdefs;

import com.xpanxion.pages.HomePage;
import com.xpanxion.tests.BaseTest;
import com.xpanxion.utils.Constants;
import cucumber.api.java.en.*;
import org.testng.Assert;

/**
 * Created by cdorsey on 9/10/2015.
 */
// Need to get BaseTest to work now

public class Test1 extends BaseTest {
    HomePage homePage;
    String actualUrl = "";
    String expectedUrl = "";

    public Test1(){
        homePage = new HomePage(driver());
    }

    @Given("^I navigate to xpanxion home page$")
    public void i_navigate_to_xpanxion_home_page(){

        actualUrl = homePage.navigation().getCurrentUrl();
        expectedUrl = homePage.getPageName();

    }

    @When("^the page loads$")
    public void the_page_loads() {
        System.out.println("Actual: " + actualUrl);
        System.out.println("Expected: " + expectedUrl);
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("^validate the url$")
    public void validate_the_url() {
        System.out.println(Constants.ON_GRID.toString());
        homePage.navigateTo();
    }




}
