package TestNg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bata {
	@Test(groups = "smoke")
	public void bata() {
		Reporter.log("i am bata",true);
		WebDriver driver = new ChromeDriver();				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bata.com/");
		driver.close();
	}

}
