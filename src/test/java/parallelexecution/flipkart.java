package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


@Ignore
public class flipkart {
	//public WebDriver driver = new ChromeDriver();
	
  @Test(priority=1)
  public void f() {
	  System.out.println(1);
  }
  @Test(priority=3,enabled = true)
  public void t() {
	  System.out.println(2);
  }
  @Test(priority=-1, enabled = false)
  public void t1() {
	  System.out.println(3);
  }
  @Test(priority=0 ,enabled = true)
  public void t2() {
	  System.out.println(4);
  }
}
