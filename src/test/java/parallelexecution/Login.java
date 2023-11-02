package parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	By username = By.xpath("//input[@name='username']");
	
	By password = By.xpath("//input[@name='password']");
	
	By login = By.xpath("//button[@type='submit']");
	
 
	  public Login(WebDriver driver) {
		  this.driver=driver;
		  
	}
	  
	  public void userName(String user) {
             driver.findElement(username).sendKeys(user);
			 
	}
	  
	  public void passWord(String pass) {
		  driver.findElement(password).sendKeys(pass);
			 
	}
	  
	  public void loginIn() {
          driver.findElement(login).click();
			 
	}

	public void setUsername(String user) {
		 driver.findElement(username).sendKeys(user);
	}

	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}


	

	public void loginPage(String user, String pass) {
		  this.driver=driver;
		
		this. userName(user);
		this.passWord(pass);
		this.  loginIn();
	}


}
