package com.allianz.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  AutomationWrapper {
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

}
}
