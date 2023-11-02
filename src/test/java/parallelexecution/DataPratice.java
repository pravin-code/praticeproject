package parallelexecution;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;

import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

 

 

public class DataPratice {

	public WebDriver driver;

  

 

  

  @Test(dataProvider = "supplier")

  public void Login(String email, String password) {

	

	  driver = new EdgeDriver();

	  driver.manage().window().maximize();

	  driver.get("https://tutorialsninja.com/demo/");

	  WebElement account = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));

	  account.click();

	  WebElement loginbtn = driver.findElement(By.xpath("(//a[contains(text(),'Login')])[1]"));

	  loginbtn.click();

	  WebElement emailInput = driver.findElement(By.xpath("//input[@id='input-email']"));

	  emailInput.sendKeys(email);

	  WebElement passwordInput = driver.findElement(By.xpath("//input[@id='input-password']"));

	  passwordInput.sendKeys(password);

	  WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));

	  button.click();

	  

	 // Assert.assertTrue(driver.getTitle().equals("My Account"));

	  

  }

 

  

  @DataProvider(name="supplier")

  public Object[][] dataSupplier(){

	  

	  String excelFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\Book1.xlsx";

	  File excelFile = new File(excelFilePath);

	  FileInputStream fis = null;

	  try {

		  fis = new FileInputStream(excelFile);

	  }catch(FileNotFoundException e) {

		  e.printStackTrace();		  

	  }

	  XSSFWorkbook workbook = null;

	  try {

		  workbook = new XSSFWorkbook(fis);

	  }catch(IOException e) {

		  e.printStackTrace();

	  }

	  XSSFSheet sheet = workbook.getSheet("Sheet1");

	  int rowsCount = sheet.getPhysicalNumberOfRows();

	  System.out.println(rowsCount);

	  int colsCount = sheet.getRow(0).getLastCellNum();

	  System.out.println(colsCount);

	  Object[][] data = new Object[rowsCount-1][colsCount];

	  for(int r =0; r < rowsCount-1; r++) {

		  XSSFRow row = sheet.getRow(r+1);

		  for(int c=0; c < colsCount; c++) {

			  XSSFCell cell = row.getCell(c);

			  CellType cellType = cell.getCellType();

			  switch(cellType) {

			  case STRING:

				  data[r][c] = cell.getStringCellValue();

				  break;

			  }			  

		  }

	  }

	return data;

  }

		  

 

  @AfterMethod

  public void afterMethod() {

  }

 

}

 


 
  
