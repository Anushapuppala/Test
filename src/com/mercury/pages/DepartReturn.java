package com.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartReturn {
	WebDriver driver;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	@CacheLookup
	private WebElement Depart;
	
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[3]/td[1]/input")
	@CacheLookup
	private WebElement Arrival;
	
	@FindBy(name="reserveFlights")
	@CacheLookup
	private WebElement reserve;
	
	public DepartReturn(WebDriver driver)
	{
		this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
	public void SelectFlight()
	{
		Depart.click();
		Arrival.click();
		reserve.click();
	}
	
}
