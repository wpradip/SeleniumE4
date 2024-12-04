package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardTrueAssert {
	@Test
	public void main() {
		String expected_url="https://demowebshop.tricentis.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url= driver.getCurrentUrl();
		Reporter.log("i am in dws page"); 
		assertEquals(expected_url, actual_url,"in am not in dws page");
		WebElement register = driver.findElement(By.className("ico-register"));
		assertTrue(register.isEnabled(),"register link is not enabled....");
		register.click();
		driver.close();
	}
}
