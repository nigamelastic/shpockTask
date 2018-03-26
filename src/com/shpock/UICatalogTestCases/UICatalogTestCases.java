package com.shpock.UICatalogTestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class UICatalogTestCases {
    private AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void initalisation() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Happy's iphone (11.2.6)");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "a2e8720a09b1d9e313aa711537bfbe1b4e9758a");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/app/Debug-iphonesimulator/UICatalog.app");
        driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub "), desiredCapabilities);
    }

    @Test(description = "checks if the application is working correctly without crashing")
    @Parameters({"headerTitleText"})
    public void checkAppLaunch(@Optional("UICatalog") String headerTitleText) {
        MobileElement headerTitle = (MobileElement) driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\"UICatalog\"]");
        Assert.assertEquals(headerTitle.getAttribute("name"), headerTitleText);
    }

    @Test(description = "clicks and opens all the UI controllers")
    @Parameters({"headerTitleText"})
    public void clickAllCatalogMoreInfo(@Optional("UICatalog") String headerTitleText) {
        for (int i = 1; i <= 18; i++) {
            MobileElement headerTitle = (MobileElement) driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\"UICatalog\"]");
            MobileElement eachMobileElementMoreInfo = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"More Info\"])[" + i + "]");
            String elementID = eachMobileElementMoreInfo.getId();
            HashMap<String, String> scrollObject = new HashMap<String, String>();
            scrollObject.put("element", elementID);
            scrollObject.put("toVisible", "not an empty string");
            driver.executeScript("mobile:scroll", scrollObject);
            eachMobileElementMoreInfo.click();
            MobileElement backUICatalog = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UICatalog\"]");
            String navigationBarTitle = ((MobileElement) driver.findElementByXPath("//XCUIElementTypeNavigationBar")).getAttribute("name");
            backUICatalog.click();
            Assert.assertTrue((driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"More Info\"])[" + i + "]/preceding-sibling::XCUIElementTypeStaticText[@name=\"" + navigationBarTitle + "\"]")).isDisplayed());
            Assert.assertEquals(headerTitle.getAttribute("name"), headerTitleText);
        }
    }

    @AfterTest
    public void destroy() {
        driver.quit();
    }
}
