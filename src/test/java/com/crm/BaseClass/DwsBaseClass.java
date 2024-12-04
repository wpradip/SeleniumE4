package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DwsBaseClass {
	public static WebDriver driver=null;
	@BeforeClass
	public void preCondition() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void login() throws InterruptedException {
		String expected_url = "https://demowebshop.tricentis.com/";
		String actual_url = driver.getCurrentUrl();
		if(expected_url.equals(actual_url)) {
			System.out.println("i am in dws page");
			driver.findElement(By.className("ico-login")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("Email")).sendKeys("magnetod2001@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("magneto123");
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
		}
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	@AfterClass
	public void postCondition() {
		driver.close();
	}
}
