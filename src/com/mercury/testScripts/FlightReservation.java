package com.mercury.testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import com.mercury.pages.DepartReturn;
import com.mercury.pages.Flight;
import com.mercury.pages.Login;
import com.mercury.pages.PassengerDetails;

public class FlightReservation extends BaseClass {
	
@Test
	public void  testBooking()
	{
		Login login = new Login(driver);
		Flight flight = new Flight(driver);
		DepartReturn Dp = new DepartReturn(driver);
		PassengerDetails Pd = new PassengerDetails(driver);
		login.loginIntoApplication();
		flight.FindFlight();
		Dp.SelectFlight();
		Pd.purchase("Srikanth", "Anusha", "1234569");
		
		String Expected = "Your itinerary has been booked!";
		String Actual = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		Assert.assertEquals(Expected,Actual);
	    
	}
	
	
	
}
