package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	
	Login1 logintest;
  @Test
  public void f() {
	  logintest = new Login1(driver);
	  
       logintest.loginPage("Admin","admin123");
	 
  }
}
