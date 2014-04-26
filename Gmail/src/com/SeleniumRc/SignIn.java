package com.SeleniumRc;

import org.junit.Test;

public class SignIn extends Login {

	
	
	@Test
	
	public void signin(){
		
		selenium.type("Email", "samkhan491@gmail.com");
	    selenium.type("Passwd", "saddam86khan");
	    selenium.click("signIn");
	    
	}
}
