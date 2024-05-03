package com.allianz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class AddEmployeeTest extends AutomationWrapper {
	
	
	@Test
	public void uploadeInvalidDisplayPictureTest(){
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
		
	
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Automation Session\\automation_workspace\\SeleniumConcept\\dummy.pdf");
		String acturalError = driver.findElement(By.xpath("//span[normalize-space()='File type not allowed']")).getText();
		Assert.assertTrue(acturalError.contains("File type not allowed"));
		
		
		
		
	}

}
