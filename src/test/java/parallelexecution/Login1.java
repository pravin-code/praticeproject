package parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login1 {

	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
 
	  public Login1(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
		  
	}
	  
	  public void userName(String user) {
             username.sendKeys(user);
			 
	}
	  
	  public void passWord(String pass) {
		  password.sendKeys(pass);
			 
	}
	  
	  public void loginIn() {
         login.click();
			 
	}

	public void setUsername(String user) {
		username.sendKeys(user);
	}

	public void setPassword(String pass) {
		password.sendKeys(pass);
	}


	

	public void loginPage(String user, String pass) {
		  this.driver=driver;
		
		this. userName(user);
		this.passWord(pass);
		this.  loginIn();
	}
}
