package com.java.appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstA {
	AndroidDriver<MobileElement> driver;
	public static void main(String []args) {
		
		DesiredCapabilities cap =new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme U1");
		cap.setCapability(MobileCapabilityType.UDID, "4HR4FEQKCMWKDAM7");
       //cap.setCapability(MobileCapabilityType.APP, "/home/anubhav/Downloads/d3/mylein-prod-nl-release-1.5.7.9-03 (1).apk");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		
		/*
		 * AndroidDriver driver= new AndroidDriver<>(new
		 * URL("http://0.0.0.0.:4723/wd/hub"));
		 */
	}
	

}
