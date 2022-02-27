package com.java.appium;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class NewTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_30_x86"); // Android Emulator

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator"); // This is Launcher activity of your app
                                                                                // (you can get it from apk info app)
        /*capabilities.setCapability("deviceId", "192.168.31.219:5555");
		"mfrkrcqofq8h49zh";*/

//"M7WSHYBU99SSDMNB" -vivo1901-MT6762-11
//4HR4FEQKCMWKDAM7-Realme U1-9

    	// mtp://Realme_RMX1831_4HR4FEQKCMWKDAM7/Internal%20shared%20storage/Myelin%20Sh
		/*
		 * Thread.sleep(10000);
		 * 
		 * 
		 * File file = new File("/home/anubhav/Downloads/d3/vivo1901/info.txt");
		 * 
		 * BufferedReader br = new BufferedReader(new FileReader(file));
		 * 
		 * String st; while ((st = br.readLine()) != null) System.out.println(st);
		 */
        

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);
        

        Thread.sleep(5000);

        // locate the Text on the calculator by using By.name()
        WebElement seven = driver.findElementById("com.android.calculator2:id/digit_7");
        seven.click();
        WebElement plus = driver.findElementById("com.android.calculator2:id/op_add");
        plus.click();
        WebElement three = driver.findElementById("com.android.calculator2:id/digit_3");
        three.click();
        WebElement equalTo = driver.findElementById("com.android.calculator2:id/eq");
        equalTo.click();

        // locate the edit box
        WebElement results = driver.findElementById("com.android.calculator2:id/formula");

        if(results.getText().equals("10"))
        {
            System.out.println("Test Passed...");
        }
        else
        {
            System.out.println("Test Failed...");
        }
    }

}