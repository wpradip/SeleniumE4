package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsRegistration;

public class Register {
	@Test
	public void main() {
		WebDriver driver = new ChromeDriver();				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals("https://demowebshop.tricentis.com/", driver.getCurrentUrl());
		
		DwsRegistration r1 = new DwsRegistration(driver);
		r1.register_button();
		r1.gender();
		r1.firstName("Pradip");
		r1.lastName("Waghmare");
		r1.email("wpradip0001@gmail.com");
		r1.password("Pradip@123");
		r1.confirmPassword("Pradip@123");
		r1.register();
	}
}
