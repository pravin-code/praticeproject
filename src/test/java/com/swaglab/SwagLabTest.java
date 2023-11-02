package com.swaglab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagLabTest extends SwagLabBase {
	
	@DataProvider(name = "swagData")
	 public Object[][] dataSupplier(){
		String excelFilePath = System.getProperty("user.dir")+"/src/test/resources/Swagdata.xlsx";
		File excelFile = new File(excelFilePath);
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(excelFile);			
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowsCount = sheet.getPhysicalNumberOfRows();
		//System.out.println(rowsCount);
		int colsCount = sheet.getRow(0).getLastCellNum();
		//System.out.println(colsCount);
		Object[][] data = new Object[rowsCount][colsCount];
		
		for(int r=0;r<rowsCount;r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<colsCount;c++) {
				XSSFCell cell = row.getCell(c);
				CellType celltype = cell.getCellType();
				switch(celltype){
				case STRING:
					data[r][c] = cell.getStringCellValue();
					break;
					}
			}
			}
		return data;
	}
	
 SwagLabLogin rgs;
 @Test(dataProvider = "swagData")
   private void loginTest(String user, String pass) {
	   rgs = new SwagLabLogin(driver);
	   rgs.signIn(user,pass);
}
 
 
 	
}
