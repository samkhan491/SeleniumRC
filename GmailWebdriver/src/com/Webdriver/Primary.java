package com.Webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Primary extends  SignIn{

	
	
	@Test
	public void prime(){
		
		driver.findElement( By.className("aKz")).click();
	}
}
