package parallelexecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DashBorad extends BaseTest {
  Login1 logintest;
  DashBoardPage dashboard;
	
	
	
	@Test
  public void DashBoardTest() {
	  logintest = new Login1(driver);
	  
	  logintest.loginPage("Admin","admin123");
	  
	  dashboard = new DashBoardPage(driver);
	  
	  Assert.assertTrue(dashboard.getDashboardTitle().contains("Dashboard"));
	  
  }
}
