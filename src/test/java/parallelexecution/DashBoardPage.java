package parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DashBoardPage {
	
	WebDriver driver;
		@FindBy(xpath="//h6[text()='Dashboard']")
		WebElement dashboardPage;
		
		public DashBoardPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		//get the title of dashboard page
		public String getDashboardTitle() {
			return dashboardPage.getText();
		}
}
