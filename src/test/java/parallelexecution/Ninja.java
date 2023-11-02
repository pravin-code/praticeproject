package parallelexecution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ninja {
	public WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js =(JavascriptExecutor) driver;
	
  @Test(priority=0, groups = {"demo"})
  public void f() {
	  driver.get("https://tutorialsninja.com/demo/");
  }
  
  @Test(priority=1,groups = {"demo"})
  public void register() throws AWTException {
	  WebElement a = driver.findElement(By.xpath("//a[@title='My Account']"));
	  a.click();
	  
	  Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		  WebElement b = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		  b.click();
		  
		  WebElement c = driver.findElement(By.xpath("//input[@name='firstname']"));
		  c.sendKeys("pravin");
		  
		  WebElement d = driver.findElement(By.xpath("//input[@name='lastname']"));
		  d.sendKeys("raj"); 
		  
		  WebElement e = driver.findElement(By.xpath("//input[@name='email']"));
		  e.sendKeys("pravin@gmail.com"); 
		  
		  WebElement f = driver.findElement(By.xpath("//input[@name='telephone']"));
		  f.sendKeys("0987654321"); 
		  
		  WebElement g = driver.findElement(By.xpath("//input[@name='password']"));
		  g.sendKeys("Pravin@123"); 
		  
		  WebElement h = driver.findElement(By.xpath("//input[@name='confirm']"));
		  h.sendKeys("Pravin@123"); 
		  
		  WebElement i = driver.findElement(By.xpath("//input[@name='agree']"));
		  i.click();
		  
		  WebElement j = driver.findElement(By.xpath("//input[@value='Continue']"));
		  j.click();  
		  
		  WebElement asr = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));

		 Assert.assertEquals(asr.getText(),"Warning: E-Mail Address is already registered!");
		
  }
	
  @Test(priority=2,groups = {"demo"})
  public void login() {
	  
	  WebElement j = driver.findElement(By.xpath("//a[contains(text(),'login page')]"));
	  j.click(); 
	  
	  WebElement k = driver.findElement(By.xpath("//input[@name='email']"));
	  k.sendKeys("pravin@gmail.com");
	  
	  WebElement l = driver.findElement(By.xpath("//input[@name='password']"));
	  l.sendKeys("Pravin@123"); 
	  
	  WebElement m = driver.findElement(By.xpath("//input[@value='Login']"));
	  m.click(); 
	  
	  WebElement asr1 = driver.findElement(By.xpath("//h2[contains(text(),'My Account')]"));

	  Assert.assertEquals(asr1.getText(),"My Account");
	
  }
  
  @Test(priority =3, dependsOnGroups = "demo",groups = {"demo1"})
  public void addingCart() {
	  
	  WebElement z = driver.findElement(By.xpath("//input[@name='search']"));
	  z.sendKeys("Samsung SyncMaster 941BW");
	  
	
	  WebElement y = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
	  y.click();
	  
	  WebElement x = driver.findElement(By.xpath("//div[@class='button-group']//child::button[@type='button']//child::i[@class='fa fa-shopping-cart']"));
	  x.click();
	  
//	  WebElement asr2 = driver.findElement(By.xpath("//div[@class='table-responsive']//child::tbody//child::td[@class='text-left']//child::a[@href='https://tutorialsninja.com/demo/index.php?route=product/product&product_id=33']"));
//	  
//	  System.out.println(asr2.getText());
//
//   
//	  Assert.assertEquals(asr2.getText(),"Samsung SyncMaster 941BW ");
	  
	  WebElement m = driver.findElement(By.xpath("//a[@title='Shopping Cart']"));
	  m.click(); 
	 }
  
  @Test(priority =4 ,dependsOnGroups = "demo",groups = {"demo1"})
  public void cart() {
	  
	  WebElement asr3 = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	  Assert.assertEquals(asr3.getText(),"Products marked with *** are not available in the desired quantity or not in stock!\n"
	  		+ "×");
	  
	  WebElement v = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	  v.click();
	  
	
  
  }
}
