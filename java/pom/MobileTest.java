package com.java.pom;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.interactions.internal.Coordinates;

import io.appium.java_client.MobileDriver;

import org.openqa.selenium.WebDriver.*;

public class MobileTest {
	
	public static void main(String[] args) {

		System.out.println("Run started");
		
		// The default empty constructor of MobileDriver should be used when running the code inside Eclipse.
		// The user must have the ECLIPSE role in this case.
		// Otherwise, use the constructor that receives the host, user and password. E.g.
		// MobileDriver driver = new MobileDriver(host, user, password);
		MobileDriver driver = new MobileDriver();

		try {
         // write your code here
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
		System.out.println("Run ended");
	}
	
	private static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}
}