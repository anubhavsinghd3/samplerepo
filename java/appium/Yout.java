package com.java.appium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.java.appium.constants.AppiumConstants;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Yout {
	public static void main(String []args) {
		
		try {DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "M7WSHYBU99SSDMNB"); // vivo1901:M7WSHYBU99SSDMNB
		// Realme RMX 1831-4HR4FEQKCMWKDAM7
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		 dc.setCapability("appPackage", "com.eterno.shortvideos");
		 dc.setCapability("appActivity","com.eterno.shortvideos.views.LaunchOrDownloadJoshActivity"); 
	 



//		URL url = new URL("http://127.0.1.1:4723/wd/hub");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.1.1:4723/wd/hub"),dc);

		Thread.sleep(2000);
		System.out.println("Josh Started");

	
		
		
		  //Open Josh Main App
		AndroidElement Button  =
		  driver.findElement(By.xpath("//android.widget.Button[@text='Open Josh Main App']"));
		//resource-id='com.eterno.shortvideos:id/download_open_button'
		 Button.click();
		  Thread.sleep(2000);
		  AndroidElement TextView =driver.findElement(By.xpath("//android.widget.TextView[@'text='English']"));
		  TextView.isEnabled();
		  Thread.sleep(2000);
		
		  AndroidElement ImageView =driver.findElementById("com.eterno.shortvideos:id/like_button_lottie");
			 
	 ImageView.click();
		} catch (Exception ex) {
			System.out.println("Exception ocurred: " + ex.getMessage());
			ex.printStackTrace();
		}

			 
		}}
		
		
	


