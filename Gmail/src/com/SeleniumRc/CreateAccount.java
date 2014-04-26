package com.SeleniumRc;

import org.junit.Test;

public class CreateAccount extends Login {


	
    @Test
	public void account(){

	
	
		selenium.click("link-signup");
	
		selenium.type("FirstName", "sam");
		selenium.type("lastname-label", "khan");
		selenium.type("GmailAddress","samkhan492");
		selenium.type("Passwd", "saddam02");
		selenium.type("PasswdAgain", "saddam02");
		selenium.type("BirthMonth", "june");
		selenium.type("BirthDay", "26");
		selenium.type("BirthYear", "1983");
		selenium.type("HiddenGender", "male");	
		selenium.type("RecoveryPhoneNumber", "6462808738");
		selenium.type("RecoveryEmailAddress", "suroviana@gmail.com");
		selenium.click("SkipCaptcha");
	    selenium.type("HiddenCountryCode", "United States");
	    selenium.click("TermsOfService");
	    selenium.click("submitbutton");
	}
}
