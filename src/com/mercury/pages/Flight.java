package com.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flight {
	
    WebDriver driver;
	@FindBy(css = "input[value='Business']")
	@CacheLookup
	private WebElement bussiness;
	
	@FindBy(name = "airline")
	@CacheLookup
	private WebElement Airline;
	
	@FindBy(name = "findFlights")
	@CacheLookup
	private WebElement next;
	
	public Flight(WebDriver driver)
	{
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    }
	public void FindFlight()
	{
		bussiness.click();
		Select air=new Select(Airline);
		air.selectByIndex(2);
		next.click();
	}
}