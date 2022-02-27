package com.java.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;


public class DemoJosh {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4HR4FEQKCMWKDAM7"); // vivo1901:M7WSHYBU99SSDMNB
		// Realme RMX 1831-
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability("appPackage", "com.eterno.shortvideos");
		dc.setCapability("appActivity", "com.eterno.shortvideos.views.LaunchOrDownloadJoshActivity");

//		URL url = new URL("http://127.0.1.1:4723/wd/hub");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.1.1:4723/wd/hub"), dc);

		System.out.println("Josh Started");
		Thread.sleep(2000);

	
		AndroidElement Button = driver.findElement(By.xpath("//android.widget.Button[@text='Open Josh Main App']"));
		// resource-id='com.eterno.shortvideos:id/download_open_button'
		Button.click();
		Thread.sleep(2000);
		AndroidElement LinearLayout = driver.findElement(
				By.xpath("//android.widget.LinearLayout[@resource-id='com.eterno.shortvideos:id/language_item_root']"));
				
		LinearLayout.click();
		Thread.sleep(2000);
		AndroidElement LL = driver.findElement(
				By.xpath("//android.widget.TextView[@resource-id='com.eterno.shortvideos:id/like_layout']"));

		LL.click();
		Thread.sleep(2000);
		TouchAction touchAction = new TouchAction(driver);

		// AndroidElement ImageView
		// =driver.findElementById("com.eterno.shortvideos:id/like_button_lottie");

		// ImageView.click();

	}

	private static WaitOptions waitOptions(Object ofMillis) {
		return null;
	}

	private static Object ofMillis(int i) {
		return null;
	}

}
