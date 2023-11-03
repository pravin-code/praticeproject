package com.parabank.para;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class ParaLoginAction {
	WebDriver driver;
	ParaRegisterLocator locators = null;
	String url,firstname,lastname,address,city,state,zipcode,phonenumber,ssn,username,password,confirmpassword;
	
	public ParaLoginAction() {
		this.locators = new ParaRegisterLocator();
		PageFactory.initElements(ParaBankBase.getDriver(), locators);
	}
	
	public void pageregister() {
       locators.pageregister.click();
	}
	public void setFirstname(String strfirstname) {
		locators.firstname.sendKeys(strfirstname);
	}
	public void setLastname(String strlastname) {
		locators.lastname.sendKeys(strlastname);
	}
	public void setAddress(String straddress) {
		locators.address.sendKeys(straddress);
	}
	public void setCity(String strcity) {
		locators.city.sendKeys(strcity);
	}
	public void setState(String strstate) {
		locators.state.sendKeys(strstate);
	}
	public void setZipcode(String strzipcode) {
		locators.zipcode.sendKeys(strzipcode);
	}
	public void setPhoneNumber(String strphonenumber) {
		locators.phnno.sendKeys(strphonenumber);
	}
	public void setSSN(String strssn) {
		locators.ssn.sendKeys(strssn);
	}
	public void setUsername(String strusername) {
		locators.username.sendKeys(strusername);
	}
	public void setPassword(String strpassword) {
		locators.password.sendKeys(strpassword);
	}
	public void setConfirmPassword(String strconfirmpassword) {
		locators.cpasssword.sendKeys(strconfirmpassword);
	}
	public void getRegisterClick() {
		locators.register.click();
	}
	
}
