package com.xpanxion.tests;

import com.xpanxion.utils.Constants;
import com.xpanxion.utils.LocalDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {
    public static WebDriver setBrowser(String browser) {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
        System.setProperty("webdriver.ie.driver", Constants.INTERNET_EXPLORER_PATH);

        switch(browser) {
            case Constants.FIREFOX:

                if(!Constants.ON_GRID) {
                    driver = new FirefoxDriver();
                } else {

                    try {
                        driver = new RemoteWebDriver(new URL("http://" + Constants.GRID_IP + ":4444/wd/hub"), DesiredCapabilities.firefox());
                    } catch (MalformedURLException e) {}
                }
                break;

            case Constants.CHROME:

                if(!Constants.ON_GRID) {
                    driver = new ChromeDriver();
                } else {

                    try {
                        driver = new RemoteWebDriver(new URL("http://" + Constants.GRID_IP + ":4444/wd/hub"), DesiredCapabilities.chrome());
                    } catch (MalformedURLException e) {}

                }

                break;

            case Constants.INTERNET_EXPLORER:

                if(!Constants.ON_GRID) {
                    driver = new InternetExplorerDriver();
                } else {

                    try {
                    	
                    	DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                    	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                        driver = new RemoteWebDriver(new URL("http://" + Constants.GRID_IP + ":4444/wd/hub"), capabilities);
                    } catch (MalformedURLException e) {}

                }
                break;

            default:

                if(!Constants.ON_GRID) {
                    driver = new ChromeDriver();
                } else {
                    try {
                        driver = new RemoteWebDriver(new URL("http://" + Constants.GRID_IP + ":4444/wd/hub"), DesiredCapabilities.chrome());
                    } catch (MalformedURLException e) {}
                }
                break;
        }

        driver.manage().window().maximize();
        return driver;
    }

    public void setup(String browser) {
        WebDriver driver = BaseTest.setBrowser(browser);
        LocalDriverManager.setDriver(driver);
    }

    public void tearDown() {
        LocalDriverManager.getDriver().quit();
    }

    public WebDriver driver() {
        //System.out.println("Thread id: " + Thread.currentThread().getId());
        //System.out.println("Hashcode of webDriver instance: " + LocalDriverManager.getDriver().hashCode());
        WebDriver driver = LocalDriverManager.getDriver();
        return driver;
    }
    
    @BeforeMethod
    public void setup() {
        setup(Constants.BROWSER);
    }

    @AfterMethod
    public void cleanUp() {
        tearDown();
    }
}
