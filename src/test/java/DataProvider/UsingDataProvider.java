package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {
	@DataProvider(name="login")
	public Object[][] provider() {
		Object[][]obj= new Object[2][2];
		obj[0][0]="magnetod2001@gmail.com";
		obj[0][1]="magneto123";
		obj[0][0]="magnetod2002@gmail.com";
		obj[0][1]="magneto321";
		return obj;
	}
	
	@Test(dataProvider = "login")
	public void receiver(String username,String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("magnetod2001@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("magneto123");
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(1000);
		driver.close();
	}
	

}
