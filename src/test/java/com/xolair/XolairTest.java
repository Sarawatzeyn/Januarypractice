package com.xolair;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XolairTest {
	WebDriver driver;
@Test
public void testOne() {
	System.out.println("hello tesNg");
}
@Test 
public void openChromeBrowser() {
	//open browser
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	//open application
	driver.get("https://www.xolairhcp.com/");
}
@Test
public void openEdgeBrowser() {
	WebDriverManager.edgedriver().setup();
	driver= new EdgeDriver();
	driver.get("https://www.xolairhcp.com/");
}
}
