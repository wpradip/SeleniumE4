package ExtentReport;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.listeners.DwsExtentReport.class)
public class TestCase1 {
	@Test
	public void honda() {
		Reporter.log("i am honda",false);
		WebDriver driver = new ChromeDriver();				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.honda2wheelersindia.com/");
		driver.close();
	}
	@Test
	public void kawasaki() {
		System.out.println("i am kawasaki");
		WebDriver driver = new ChromeDriver();				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://kawasaki-india.com/");
		driver.close();
		assertEquals("Pratik", "prateek");
	}
	@Test(dependsOnMethods = "kawasaki")
	public void royalEnfield() {
		System.out.println("i am royal enfield");
		WebDriver driver = new ChromeDriver();				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalenfield.com/");
		driver.close();
	}

}
