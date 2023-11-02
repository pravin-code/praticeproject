package com.swaglab;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLabBase {
public static WebDriver driver;

	
	
	@BeforeMethod
	public void setUp() {
		 	  EdgeOptions options = new EdgeOptions();
			  options.addArguments("--remote-allow-origins=*");
			  driver = new EdgeDriver();
			 
			 // driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.get("https://www.saucedemo.com/v1/index.html");
		  }
		 
		  @AfterTest
		  public void close() {
			  //driver.close();
		  }
}
