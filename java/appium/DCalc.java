package com.java.appium;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DCalc{
	
	



static WebDriver driver;
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	DesiredCapabilities cap = new DesiredCapabilities();
	/*
	 * capabilities.setCapability("automationName", "UiAutomator2");
	 * //capabilities.setCapability("Automation", "UiAutomator2");
	 * capabilities.setCapability("platformVersion", "8.1.0");
	 * capabilities.setCapability("deviceName","5200da6c43e15623");
	 * capabilities.setCapability("platformName","Android");
	 */
	
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "UiAutomator2");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1901");
	cap.setCapability(MobileCapabilityType.UDID, "M7WSHYBU99SSDMNB");
  
   cap.setCapability("appPackage", "com.android.bbkcalculator");
// This package name of your app (you can get it from apk info app)
	cap.setCapability("appActivity","com.android.bbkcalculator.Calcultor"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
   driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
}


public void testCal() throws Exception {
   //locate the Text on the calculator by using By.name()
   WebElement two=driver.findElement(By.name("2"));
   two.click();
   WebElement plus=driver.findElement(By.name("+"));
   plus.click();
   WebElement four=driver.findElement(By.name("4"));
   four.click();
   WebElement equalTo=driver.findElement(By.name("="));
   equalTo.click();
   //locate the edit box of the calculator by using By.tagName()
   WebElement results=driver.findElement(By.tagName("EditText"));
	//Check the calculated value on the edit box
assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";

}

public void teardown(){
	//close the app
	driver.quit();
}
}