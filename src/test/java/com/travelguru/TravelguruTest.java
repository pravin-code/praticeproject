package com.travelguru;

import org.testng.annotations.Test;

public class TravelguruTest extends TravelguruBase {
	
	TravelguruRegister rgs;
  @Test
  public void test() {
	  rgs = new TravelguruRegister(driver);
	  rgs.registration();
  }
}
