package com.java.appium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.java.appium.constants.AppiumConstants;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BatteryExo {
	public static void main(String[] args) throws InterruptedException, IOException {

		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AppiumConstants.AUTOMATION_NAME);
			dc.setCapability("udid", "192.168.1.123:5555");
			//dc.setCapability("udid", "mfrkrcqofq8h49zh");
			
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, AppiumConstants.PLATFORM_NAME);
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, AppiumConstants.PLATFORM_VERSION);
			dc.setCapability("appPackage", AppiumConstants.appPackage);
			dc.setCapability("appActivity", AppiumConstants.appActivity);
			dc.setCapability("newCommandTimeout", 3605);

			dc.setCapability("autoGrantPermissions", true);
			dc.setCapability("suppressKillServer", true);

			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
					new URL("http://127.0.1.1:4723/wd/hub"), dc);

			System.out.println("Selecting the 1hr video");

			AndroidElement TextView = driver.findElement(By.xpath("//android.widget.TextView[@text='1 hour Videos']"));

			TextView.click();
			Thread.sleep(2000);
			System.out.println("Clicking on 360P video");

			AndroidElement LinearLayout = driver.findElement(By.xpath("//android.widget.TextView[@text='360p']"));
			LinearLayout.click();

			Thread.sleep(10000);
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile, new File("/home/anubhav/Downloads/d3/abc.jpeg"));

			System.out.println("360p video is playing");

		} catch (Exception ex) {
			System.out.println("Exception ocurred: " + ex.getMessage());
			ex.printStackTrace();
		}

	}

}
