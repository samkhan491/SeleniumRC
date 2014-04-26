package com.SeleniumRc;

import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;



public class Login {

	
	DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox", "http://www.gmail.com");


	@Before

	public void browserOpen(){

	   selenium.start();
	   selenium.open("/");
	   selenium.windowMaximize();
	   selenium.setSpeed("4000");
	   
	   }
	

	public void browserClose(){

	selenium.close();
	selenium.stop();
	
	}
	
	
	}
