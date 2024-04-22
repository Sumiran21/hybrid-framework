package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper { 
	
	

	@Test(priority=1)
	public void titleTest()

	{
		
		String pagename = driver.getTitle();
		System.out.println("title1 " +pagename);
		
		Assert.assertEquals(pagename, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void applicationDescriptionTest()
	{
		
		
		WebElement description = driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.6.1']"));
		String desp = description.getText();
		System.out.println("title2 " +desp);
		Assert.assertEquals(desp, "OrangeHRM OS 5.6.1");
	}
}
