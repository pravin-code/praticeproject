package com.parabank.para;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParaRegisterLocator {

	@FindBy(xpath = "//a[@href='register.htm']")
	WebElement pageregister;

	
	@FindBy(xpath = "//input[@id='customer.firstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='customer.lastName']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='customer.address.street']")
	WebElement address;
	
	
	@FindBy(xpath = "//input[@id='customer.address.city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@id='customer.address.state")
	WebElement state;
	
	@FindBy(xpath = "//input[@id='customer.address.zipCode']")
	WebElement zipcode;
	
	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	WebElement phnno;
	
	@FindBy(xpath = "//input[@id='customer.ssn']")
	WebElement ssn;
	
	@FindBy(xpath = "//input[@id='customer.username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='customer.password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='repeatedPassword']")
	WebElement cpasssword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement register;

}
