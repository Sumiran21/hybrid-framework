package com.allianz.test;
import javax.sound.midi.InvalidMidiDataException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.utils.DataUtils;



public class LoginTest extends AutomationWrapper {
	
	@Test(dataProvider = "validloginData", dataProviderClass = DataUtils.class)
	public void validLoginTest(String username, String password, String expectedHeader) {
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		String actualheader = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertEquals(actualheader, expectedHeader);
		
			
	}
	
	
	
	
	@Test(dataProvider = "invalidloginData", dataProviderClass = DataUtils.class)
	public void invalidLoginTest(String username, String password, String expectedError) {
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		String actualerror = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		Assert.assertEquals(actualerror, expectedError);
		System.out.println("InvalidTest "+username +password +expectedError);
		
		
	}

}
