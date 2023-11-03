package com.parabank.para;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	String strpassword,strurl,strfirstname,strlastname,straddress,strcity,strstate,strzipcode,strphonenumber,strssn,
	strusername,strconfirmpassword;
	
	public Utility() {
		Register();
	}
	
	public void Register(){
		File file = new File("C:\\Users\\pkannan2\\Selenium\\para\\src\\test\\resources\\Data.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}catch(IOException e) {
			e.printStackTrace();
		}
		strurl = prop.getProperty("url");
		strfirstname = prop.getProperty("frstname");
		strlastname = prop.getProperty("lastname");
		straddress =prop.getProperty("address");
		strcity = prop.getProperty("city");
		strstate = prop.getProperty("state");
		strzipcode = prop.getProperty("zipcode");
		strphonenumber = prop.getProperty("phonenumber");
		strssn = prop.getProperty("ssn");
		strusername = prop.getProperty("username");
		strpassword = prop.getProperty("password");
		strconfirmpassword= prop.getProperty("cpassword");
		}

}
