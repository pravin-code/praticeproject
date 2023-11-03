package com.parabank.para;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParaStepDefinition {
	
	ParaLoginAction paraAction = new ParaLoginAction();
	Utility obj = new Utility();
	
	
	@Given("User is on the para bank register page")
	public void user_is_on_the_para_bank_register_page() {
		paraAction.pageregister();
	   System.out.println("url");
	   ParaBankBase.openPage(obj.strurl);
	}

	@When("User enters the Firstname")
	public void user_enters_the_firstname() {
	   System.out.println("frstname");
	   paraAction.setFirstname(obj.strfirstname);
	}

	@When("user enters the Lastname")
	public void user_enters_the_lastname() {
		 System.out.println("lastname");
		 paraAction.setLastname(obj.strlastname);
	}

	@When("user enters the Address")
	public void user_enters_the_address() {
		 System.out.println("address");
		 paraAction.setAddress(obj.straddress);
	}

	@When("user enters the City")
	public void user_enters_the_city() {
		 System.out.println("city");
		 paraAction.setCity(obj.strcity);
	}

	@When("user enters the State")
	public void user_enters_the_state() {
		 System.out.println("state");
		 paraAction.setState(obj.strstate);
	}

	@When("user the enters the Zip code")
	public void user_the_enters_the_zip_code() {
		 System.out.println("zipcode");
		 paraAction.setZipcode(obj.strzipcode);
		   
	}

	@When("user the enters the Phone number")
	public void user_the_enters_the_phone_number() {
		System.out.println("phonenumber");
		paraAction.setPhoneNumber(obj.strphonenumber);
	}

	@When("user the enters the SSN number")
	public void user_the_enters_the_ssn_number() {
		System.out.println("ssn");
		paraAction.setSSN(obj.strssn);
	}

	@When("user the enters the Username")
	public void user_the_enters_the_username() {
		System.out.println("username");
		paraAction.setUsername(obj.strusername);
	}

	@When("user the enters the Passowrd")
	public void user_the_enters_the_passowrd() {
		System.out.println("password");
		paraAction.setPassword(obj.strpassword);
	}

	@When("user the enters the Passowrd Confirm")
	public void user_the_enters_the_passowrd_confirm() {
		System.out.println("confirmpassword");
		paraAction.setConfirmPassword(obj.strconfirmpassword);
	}

	@When("user clicks the Register")
	public void user_clicks_the_register() {
		System.out.println("click");
		paraAction.getRegisterClick();
	   
	}
//	@Then("user gets Confimation message")
//	public void user_gets_confimation_message() {
//	    Assert.assertEquals(register.getConfirmationmessage(),"Your account was created successfully. You are now logged in." );
//	}
//	@Then("user clicks Logout")
//	public void user_clicks_logout() {
//	    register.getLogout();
//	}

}
