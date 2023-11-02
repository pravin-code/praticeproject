package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
	
	public WebDriver driver = new ChromeDriver();
  @Test
  public void f() {
	  
	  driver.get("https://www.ajio.com/");
  }
}
