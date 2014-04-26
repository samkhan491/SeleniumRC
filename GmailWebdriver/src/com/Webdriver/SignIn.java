package com.Webdriver;

import org.junit.Test;
import org.openqa.selenium.By;


public class SignIn extends Base {

	@Test
	
	public void home(){

		driver.findElement(By.id("Email")). sendKeys("samkhan491@gmail.com");
		driver.findElement(By.id("Passwd")). sendKeys("saddam86khan");
		driver.findElement(By.id("signIn")). click();
		
}
	
}

