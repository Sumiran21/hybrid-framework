package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest {

	@Test(priority=2)
	public void titleTest()

	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.open-emr.org/");
		
		String pagename = driver.getTitle();
		System.out.println("title " +pagename);
		
		Assert.assertEquals(pagename, "OrangeHRM");
	}
	
	@Test(priority=1)
	public void applicationDescriptionTest()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement description = driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.6.1']"));
		String desp = description.getText();
		
		System.out.println("title " +desp);
		Assert.assertEquals(desp, "OrangeHRM OS 5.6.1");
	}
}
