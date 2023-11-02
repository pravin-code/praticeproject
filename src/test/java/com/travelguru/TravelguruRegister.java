package com.travelguru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TravelguruRegister {

	WebDriver driver;
	

	@FindBy(xpath = "//li[@class=\"list-dropdown js_logInHide\"]/child::a")
	WebElement account;

	@FindBy(xpath = "//a[@title='Signup']")
	WebElement signUp;

	@FindBy(id = "fname")
	  WebElement fname;

	@FindBy(id = "lname")
	WebElement lname;

	@FindBy(id = "mobile")
	WebElement mobile;

	@FindBy(id = "emailId")
	WebElement email;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "cpassword")
	WebElement cpassword;

	@FindBy(id = "btn_register")
	WebElement register;

	@FindBy(xpath = "//h3[@class='disInline regSuccessMsg']")
	WebElement cregister;

	@FindBy(id = "home-page-link")
	WebElement homepage;

	public TravelguruRegister(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void account() {
		account.click();
	}

	public void signUP() {
		signUp.click();
	}

	public void setfname(String fname1) {
		fname.sendKeys(fname1);
	}

	public void setlname(String lname1) {
		lname.sendKeys(lname1);
	}

	public void setmobile(String mobile1) {
		mobile.sendKeys(mobile1);
	}

	public void setEmail(String email1) {
		email.sendKeys(email1);
	}

	public void setPassword(String password1) {
		password.sendKeys(password1);
	}

	public void setcpassword(String cpassword1) {
		cpassword.sendKeys(cpassword1);
	}

	public void clickregister() {
		register.click();;
	}

//	public String registerConfirmation() {
//		return cregister.getText();
//	}
//
	public void clickGoToHomePage() {
		homepage.click();
	}
	
	public void registration() {
		 this.account();
		 this.signUP();
		
		this.setfname(fname);
		this.setlname("rj");
		this.setmobile("9551103023");
		this.setEmail("pravin98.k@gmai");
		this.setPassword("pravin@123");
		this.setcpassword("pravin@123");
		this.clickregister();
		//this.registerConfirmation();
		this.clickGoToHomePage();
	}
}
