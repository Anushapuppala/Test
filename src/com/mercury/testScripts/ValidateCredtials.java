package com.mercury.testScripts;

import org.testng.Assert;
import org.testng.annotations.*;
import com.mercury.pages.Login;

public class ValidateCredtials extends BaseClass {
	 
		@Test
		public void testCredtials()
		{
			Login l = new Login(driver);
			l.loginIntoApplication();
			String expected = "Find a Flight: Mercury Tours:";
			String Actual = driver.getTitle();
			Assert.assertEquals(expected,Actual);
			
		}
	
}
