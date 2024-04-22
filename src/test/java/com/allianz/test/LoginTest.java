package com.allianz.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;



public class LoginTest extends AutomationWrapper {
	
	@Test(priority=1)
	public void validLoginTest() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		String actualheader = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertEquals(actualheader, "Dashboard");
		
			
	}
	
	@Test(priority=2)
	public void invalidLoginTest() {
		
		driver.findElement(By.name("username")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		String actualerror = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		Assert.assertEquals(actualerror, "Invalid credentials");
		
		
	}

}
