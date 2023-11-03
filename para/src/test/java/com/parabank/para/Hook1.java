package com.parabank.para;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook1 {
	@Before
	public static void setUp() {
		ParaBankBase.setUpDriver();
	}
	@After
	public static void tearDow(Scenario scenario) {
		//LoginBase.tearDown();
	}

}
