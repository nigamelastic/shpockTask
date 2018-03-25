package com.shpock.UICatalogTestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class UICatalogTestCases {
    private AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void initalisation() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X (11.2)");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "77BA4762-52F0-416D-BDE0-0DFA2FF278A7");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/app/Debug-iphonesimulator/UICatalog.app");
        driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub "), desiredCapabilities);
    }

    @Test
    public void click() {
        MobileElement el2 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"More Info\"])[1]");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Okay / Cancel");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Okay / Cancel");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
        el6.click();
        el6.click();
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Other");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Safe Choice");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Other");
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Destructive Choice");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
        el13.click();
        MobileElement el14 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UICatalog\"]");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"More Info\"])[2]");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UICatalog\"]");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"More Info\"])[3]");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementByAccessibilityId("Text Entry");
        el19.click();
        MobileElement el20 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeAlert[@name=\"A Short Title Is Best\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther");
        el20.sendKeys("12345abcd#$");
        MobileElement el21 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el21.click();
        MobileElement el22 = (MobileElement) driver.findElementByAccessibilityId("Secure Text Entry");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeAlert[@name=\"A Short Title Is Best\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther");
        el23.sendKeys("12345abcd#$");
        MobileElement el24 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el24.click();
        MobileElement el25 = (MobileElement) driver.findElementByAccessibilityId("Simple");
        el25.click();
        MobileElement el26 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el26.click();
        MobileElement el27 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UICatalog\"]");
        el27.click();
        MobileElement el28 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"More Info\"])[11]");
        el28.click();
        MobileElement el29 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeSlider");
        
        MobileElement el32 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UICatalog\"]");
        el32.click();
        MobileElement el33 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"More Info\"])[5]");
        el33.click();
    }


    @AfterTest
    public void destroy(){
        driver.quit();
    }
}
