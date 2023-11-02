package parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMeter {
	public WebDriver driver;

		By username= By.name("username");

		By password=By.name("password");

		By login=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

	    By logintitle=By.xpath("//span[@class='oxd-topbar-header-breadcrumb']");

		By error=By.xpath("//p[text()='Invalid credentials']");

	  @BeforeMethod

	  @Parameters("browser")

	  public void ParameterizatedTest(String browser) {

		if(browser.equalsIgnoreCase("edge")) {

			  EdgeOptions options=new EdgeOptions();

			  options.addArguments("--start-maximized");

			  driver=new EdgeDriver(options);

			  System.out.println("Brower Started :"+ browser);

		  }

		  else if(browser.equalsIgnoreCase("chrome")) {

			  ChromeOptions options=new ChromeOptions();

			  options.addArguments("--start-maximized");

			  driver=new ChromeDriver(options);

			  System.out.println("Brower Started :"+ browser);

		  }

		else{

			System.out.println("Invalid");

		}

	  }

	  @Test

	  public void f() {
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		  driver.findElement(username).sendKeys("Admin");

		  driver.findElement(password).sendKeys("admin123");

		driver.findElement(login).click();

		String pageText1 = driver.findElement(logintitle).getText();

		System.out.println("pageText :"+ pageText1);

		Assert.assertEquals(pageText1, "Dashboard");
   
	  }

		@Test

		  public void f1() {  
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			driver.findElement(username).sendKeys("1234");

			  driver.findElement(password).sendKeys("admin123");

			driver.findElement(login).click();

			String errorMeassage = driver.findElement(error).getText();

			System.out.println("ActualErrorMeassage :"+ errorMeassage);

			Assert.assertEquals(errorMeassage, "Invalid credentials");

			}

	 

	  @AfterTest

	  public void afterTest() {

		  driver.quit();

	  }
  
}




