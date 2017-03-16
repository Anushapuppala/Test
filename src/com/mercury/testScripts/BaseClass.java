package com.mercury.testScripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	 public WebDriver driver;
	 
		@BeforeTest
		public void openBrowser ()
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://newtours.demoaut.com/");
		}
		
		@AfterTest
		public void Closebrowser()
		{
			driver.close();
			
		}
}
