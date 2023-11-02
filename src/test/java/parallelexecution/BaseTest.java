package parallelexecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest{




	public static WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
		 	  EdgeOptions options = new EdgeOptions();
			  options.addArguments("--remote-allow-origins=*");
			  driver = new EdgeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.get("https://opensource-demo.orangehrmlive.com/");
		  }
		 
		  @AfterClass
		  public void close() {
			  //driver.close();
		  }
	}
