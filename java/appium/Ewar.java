package com.java.appium;

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Ewar {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		

		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		//dc.setCapability("udid", "192.168.43.1:5555");
		dc.setCapability("udid", "4HR4FEQKCMWKDAM7");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability("appPackage", "com.google.android.youtube");
		dc.setCapability("appActivity", "com.google.android.youtube.HomeActivity");
		dc.setCapability("newCommandTimeout", 3605);

		dc.setCapability("autoGrantPermissions", true);
		dc.setCapability("suppressKillServer", true);

		
		  AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>( new
		  URL("http://127.0.1.1:4723/wd/hub"), dc);
          TouchAction swipe = new TouchAction(driver)
                  .press(PointOption.point(540,1824))
                  .waitAction(waitOptions(ofMillis(800)))
                  .moveTo(PointOption.point(540,672))
                  .release()
                  .perform();
		  
		
		  

	}

	private static WaitOptions waitOptions(Object ofMillis) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object ofMillis(int i) {
		// TODO Auto-generated method stub
		return null;
	}}