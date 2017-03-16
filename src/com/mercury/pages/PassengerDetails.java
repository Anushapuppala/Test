package com.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassengerDetails {

	
	WebDriver driver;
	@FindBy(name = "passFirst0")
	@CacheLookup
	private WebElement First;
	
	@FindBy(name = "passLast0")
	@CacheLookup
	private WebElement Last;
	
	@FindBy(name = "creditnumber")
	@CacheLookup
	private WebElement Credit;
	@FindBy(name = "buyFlights")
	@CacheLookup
	private WebElement purchase;
	
	public PassengerDetails(WebDriver driver)
	{
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    }
	
	public void purchase(String Sname, String Slast,String Scredit)
	{
		First.sendKeys(Sname);
		Last.sendKeys(Slast);
		Credit.sendKeys(Scredit);
		purchase.click();
	}
	
}
