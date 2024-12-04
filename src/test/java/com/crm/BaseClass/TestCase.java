package com.crm.BaseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase extends DwsBaseClass{
	@Test
	public void testScript1() throws InterruptedException {
		String expected_url = "https://demowebshop.tricentis.com/news/rss/1";
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']"));
		for (WebElement web : links) {
			web.click();
			String actual_url = driver.getCurrentUrl();
			if(actual_url.equals(expected_url)) {
			driver.navigate().back();
			}
			Thread.sleep(2000);
		}
		System.out.println("TestScript1");
	}
	@Test
	public void testScript2() {
		driver.findElement(By.id("small-searchterms")).sendKeys("Ladki");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println("TestScript2");
	}
}
