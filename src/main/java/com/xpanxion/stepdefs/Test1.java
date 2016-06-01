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

    @Given("^I navigate to xpanxion home page$")
    public void i_navigate_to_xpanxion_home_page(){
    	System.out.println(Constants.ON_GRID.toString());
    	homePage = new HomePage(driver());
    }

    @When("^the page loads$")
    public void the_page_loads() {
    	actualUrl = homePage.navigation().getCurrentUrl();
    	expectedUrl = homePage.getPageName();
        System.out.println("Actual: " + actualUrl);
        System.out.println("Expected: " + expectedUrl);
    }

    @Then("^validate the url$")
    public void validate_the_url() {
        Assert.assertEquals(actualUrl,expectedUrl);
    }
}
