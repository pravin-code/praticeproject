package com.swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SwagLabLogin {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='user-name']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password; 
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement login; 
	
	public SwagLabLogin(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void username(String username1) {
		username.sendKeys(username1);
	}
	
	public void password(String password1) {
		password.sendKeys(password1);
	}


	public void setUsername(String username1) {
		username.sendKeys(username1);
	}



	public void setPassword(String password1) {
		password.sendKeys(password1);
	}

	public void login() {
          login.click();
	}
	 @Test(dataProvider ="swagData" )
	  public void signIn(String username1,String password1) {
		  this.driver = driver;
				setUsername(username1);
				 setPassword(password1);
				 
				 login();

	  }
 
  
}
