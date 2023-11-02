package parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPratice {
	WebDriver driver;
	By username= By.name("username");

	By password=By.name("password");

	By login=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	
	@DataProvider(name = "testdata")
	public Object [][] testMethod(){
		return new Object[][] {{"Admin","admin123"}};
	}
	
	@Test(dataProvider = "testdata")
	public void setUp(String keyword) 
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		driver.findElement(username).sendKeys("keyword");

		  driver.findElement(password).sendKeys("keyword1");

		driver.findElement(login).click();

	}
 
}
