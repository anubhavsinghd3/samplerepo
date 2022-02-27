package com.java.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.java.appium.constants.AppiumConstants;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class IG {
	public static void main(String []args) throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		//dc.setCapability("udid", "192.168.43.1:5555");
		dc.setCapability("udid", "RZ8N50G4W3X");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability("appPackage", "com.phonepe.app");
		dc.setCapability("appActivity", "com.phonepe.app.ui.activity.Navigator_MainActivity");
		dc.setCapability("newCommandTimeout", 3605);

		dc.setCapability("autoGrantPermissions", true);
		dc.setCapability("suppressKillServer", true);

		
		  AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>( new
		  URL("http://127.0.1.1:4723/wd/hub"), dc);
		
		
		
		/*
		 * AndroidElement TextView = driver.findElement(By.
		 * xpath("//android.widget.TextView[@text='1 hour Videos']"));
		 * 
		 * TextView.click();
		 */
		
		
		AndroidElement Button =driver.findElement(By.xpath("//android.widget.Button[@text='NONE OF THE ABOVE']"));
		Button.click();
		Thread.sleep(2000);
		
		AndroidElement EditText=driver.findElement(By.xpath("//android.widget.EditText[@text='10 Digit Mobile Number']"));
		
		EditText.sendKeys("8516072572");
		Thread.sleep(2000);
		AndroidElement TextView=driver.findElement(By.xpath("//android.widget.TextView[@text='PROCEED']"));
		
		TextView.click();
		Thread.sleep(2000);
		

	}

	

}
