package Testing;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreatingDependencies {
	@Test(timeOut = 1000)
	public void createAccount() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(1000);
		driver.close();
		System.out.println("Create Account");
	}
	@Test(dependsOnMethods = "createAccount")
    public void modifyAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.delhicapitals.in/");
		driver.close();
		System.out.println("Modify Account");
	}
		
	@Test(dependsOnMethods = "createAccount")
    public void deleteAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		driver.close();
		System.out.println("Delete Account");
		
	}
}
