package com.java.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HS { public static void main(String []args) throws MalformedURLException {
	

	DesiredCapabilities dc =new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	//dc.setCapability("udid", "192.168.43.1:5555");
	dc.setCapability("udid", "mfrkrcqofq8h49zh");
	
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability("appPackage", "in.startv.hotstar");
	dc.setCapability("appActivity", "in.startv.hotstar.rocky.personalization.ContinueWatchingActivity");
	dc.setCapability("newCommandTimeout", 3605);

	dc.setCapability("autoGrantPermissions", true);
	dc.setCapability("suppressKillServer", true);

	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
			new URL("http://127.0.1.1:4723/wd/hub"), dc);
	
	
	
	
	
	
}

}
