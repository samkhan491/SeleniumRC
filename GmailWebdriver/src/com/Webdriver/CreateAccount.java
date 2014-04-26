package com.Webdriver;

import org.junit.Test;
import org.openqa.selenium.By;

public class CreateAccount extends Base {

	
	
	@Test
	public void account(){

		driver.findElement(By.id("gmail-create-account")).click();
		driver.findElement(By.id("FirstName")). sendKeys("sam");
		driver.findElement(By.id("LastName")). sendKeys("Khan");
		driver.findElement(By.id("GmailAddress")). sendKeys("samkhan3330");
		driver.findElement(By.id("Passwd")). sendKeys("saddam02");
		driver.findElement(By.id("PasswdAgain")). sendKeys("saddam02");
		driver.findElement(By.id("HiddenBirthMonth")). sendKeys("june");
		driver.findElement(By.id("BirthDay")). sendKeys("26");
		driver.findElement(By.id("Birthyear")). sendKeys("1982");
		driver.findElement(By.id("RecoveryPhoneNumber")). sendKeys("6462808738");
		driver.findElement(By.id("RecoveryEmailAddress")). sendKeys("suroviana@gmail.com");
		driver.findElement(By.id("Skipcaptcha")). click();
		driver.findElement(By.id("TermsOfservice")). click();
		driver.findElement(By.id("submitbutton")). click();
	    
	
	
	}
}
