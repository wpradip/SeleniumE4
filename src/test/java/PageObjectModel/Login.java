package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsLogin;

public class Login {

	@Test
	public void main() {
		WebDriver driver = new ChromeDriver();				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals("https://demowebshop.tricentis.com/", driver.getCurrentUrl());
//		DwsLogin ref = new DwsLogin(driver);
//		ref.login_link.click();
//		ref.email.sendKeys("magnetod2001@gmail.com");
//		ref.password.sendKeys("magneto123");
//		ref.remember_me.click();
//		ref.login_button.click();
		
		DwsLogin d1 = new DwsLogin(driver);
		d1.login_link();
		d1.email("magnetod2001@gmail.com");
		d1.password("magneto123");
		d1.rememberme();
		d1.login_button();
		
		DwsLogin d2 = new DwsLogin(driver);
		
		d2.login("magnetod2001@gmail.com","magneto123");

	}

}
